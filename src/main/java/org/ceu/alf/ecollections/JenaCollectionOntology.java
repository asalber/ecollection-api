package org.ceu.alf.ecollections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.net.URISyntaxException;

import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.RDF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class that implement the {@code CollectionOntology} interface with the <a
 * href=https://jena.apache.org>Jena library</a>.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 */
public class JenaCollectionOntology implements CollectionOntology {
  private static final Logger LOG = LoggerFactory.getLogger(JenaCollectionOntology.class);
  private OntModel model;

  /**
   * Default constructor that creates an empty collection ontology.
   * 
   */
  public JenaCollectionOntology() {
    model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
  }

  /**
   * Constructor that creates a collection ontology from an string containing a serialized ontology.
   * 
   * @param serializedOntology
   *          a string containing a serialized ontology.
   */
  public JenaCollectionOntology(String serializedOntology) {
    model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
    StringReader input = new StringReader(serializedOntology);
    model.read(input, null);
    LOG.info("Ontology loaded.");
    LOG.info("Number of statements: " + model.size());
  }

  /**
   * Constructor that creates a collection ontology from an string containing a serialized ontology.
   * 
   * @param ontologyFile
   *          a file containing a serialized ontology.
   * @throws FileNotFoundException
   *           File not found exception.
   */
  public JenaCollectionOntology(File ontologyFile) throws FileNotFoundException {
    model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
    FileInputStream input = new FileInputStream(ontologyFile);
    model.read(input, null);
    LOG.info("Ontology loaded from " + ontologyFile);
    LOG.info("Number of statements: " + model.size());
  }

  /**
   * Method that gets the Jena model of the ontology.
   * 
   * @return the Jena model of the ontology.
   */
  @Override
  public OntModel getOntologyModel() {
    return model;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.CollectionOntology#getMultiheteroset(java.lang.String)
   */
  @Override
  public OntologyMultiheteroset getMultiheteroset(String uri) {
    Individual collection = model.getIndividual(uri); 
    if (collection == null) {
      System.err.println("There are no resource with uri " + uri + " in the ontology.");
      return null;
    }
    if (!collection.hasProperty(RDF.type,
        model.getResource(OntologyMultiheteroset.MultiheterosetUri.toString()))) {
      System.err
          .println("There resource with uri " + uri + " not belongs to the Multiheteroset class.");
      return null;
    }
    OntologyMultiheteroset multiheteroset = new StandardOntologyMultiheteroset();
    StmtIterator iter =
        collection.listProperties(model.getProperty(CollectionOntology.hasItemUri.toString()));
    while ( iter.hasNext()) {
      Statement stmt = (Statement) iter.next();
      multiheteroset.add(getContent((Resource) stmt.getObject()).toString());
    }
    return multiheteroset;
  }

  private RDFNode getContent(Resource item) {
    return item
        .getPropertyResourceValue(model.getProperty(CollectionOntology.hasContentUri.toString()));
  }
}
