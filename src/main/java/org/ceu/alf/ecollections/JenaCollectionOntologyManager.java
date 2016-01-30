package org.ceu.alf.ecollections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.net.URI;

import org.apache.jena.ontology.Individual;
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
 * Class that implement the {@code CollectionOntologyManager} interface with the
 * <a href=https://jena.apache.org>Jena library</a>.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 */
public class JenaCollectionOntologyManager implements CollectionOntologyManager {
  private static final Logger LOG = LoggerFactory.getLogger(JenaCollectionOntologyManager.class);
  private OntModel model;

  /**
   * Default constructor that creates an empty collection ontology.
   */
  public JenaCollectionOntologyManager() {
    model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
  }

  /**
   * Constructor that creates a collection ontology from an string containing a serialized ontology.
   * 
   * @param serializedOntology
   *          a string containing a serialized ontology.
   */
  public JenaCollectionOntologyManager(String serializedOntology) {
    this.model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
    StringReader input = new StringReader(serializedOntology);
    this.model.read(input, null);
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
  public JenaCollectionOntologyManager(File ontologyFile) throws FileNotFoundException {
    this.model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
    FileInputStream input = new FileInputStream(ontologyFile);
    this.model.read(input, null);
    LOG.info("Ontology loaded from " + ontologyFile);
    LOG.info("Number of statements: " + model.size());
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.CollectionOntologyManager#getOntologyModel()
   */
  @Override
  public OntModel getOntologyModel() {
    return model;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.CollectionOntologyManager#getMultiheteroset(java .lang.String)
   */
  @Override
  public OntologyMultiheteroset getMultiheteroset(String uri) {
    Individual collection = this.model.getIndividual(uri);
    if (collection == null) {
      System.err.println("There are no resource with uri " + uri + " in the ontology.");
      return null;
    }
    if (!collection.hasProperty(RDF.type,
        this.model.getResource(CollectionOntologyManager.MultiheterosetUri.toString()))) {
      System.err
          .println("There resource with uri " + uri + " not belongs to the Multiheteroset class.");
      return null;
    }
    OntologyMultiheteroset multiheteroset = new StandardOntologyMultiheteroset();
    StmtIterator iter = collection
        .listProperties(this.model.getProperty(CollectionOntologyManager.hasItemUri.toString()));
    while ( iter.hasNext()) {
      Statement stmt = (Statement) iter.next();
      multiheteroset.add(getItemContent((Resource) stmt.getObject()).toString());
    }
    return multiheteroset;
  }

  @Override
  public OntologyMultiset getMultiset(String uri) throws ElementOfWrongTypeException {
    Individual collection = this.model.getIndividual(uri);
    if (collection == null) {
      System.err.println("There are no resource with uri " + uri + " in the ontology.");
      return null;
    }
    if (!collection.hasProperty(RDF.type,
        this.model.getResource(CollectionOntologyManager.MultisetUri.toString()))) {
      System.err
          .println("There resource with uri " + uri + " not belongs to the Multiset class.");
      return null;
    }
    URI type =
        URI.create(
            collection
        .getPropertyResourceValue(
            this.model.getProperty(CollectionOntologyManager.hasElementsOfTypeUri.toString()))
                .toString());
    OntologyMultiset multiset = new StandardOntologyMultiset(type);
    StmtIterator iter = collection
        .listProperties(this.model.getProperty(CollectionOntologyManager.hasItemUri.toString()));
    while (iter.hasNext()) {
      Statement stmt = (Statement) iter.next();
      String content = getItemContent((Resource) stmt.getObject()).toString();
      if (this.model.getResource(content).hasProperty(RDF.type,
          this.model.getResource(type.toString()))) {
        multiset.add(content);
      } else {
        throw new ElementOfWrongTypeException(
            "The element " + content + " not belongs to the class " + type);
      }
    }
    return multiset;
  }

  /**
   * Method that returns the content of an item.
   * 
   * @param item
   *          a resource of the class item.
   * @return the RDFNode contained in the item.
   */
  private RDFNode getItemContent(Resource item) {
    return item
.getPropertyResourceValue(model.getProperty(CollectionOntologyManager.hasContentUri.toString()));
  }

  @Override
  public OntologyHeteroset getHeteroset(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyList getList(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyBox getBox(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologySet getSet(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologySequence getSequence(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyMulticombination getMulticombination(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyHeteroranking getHeteroranking(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyHeterocombination getHeterocombination(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyTuple getTuple(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyRanking getRanking(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyCombination getCombination(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyVector getVector(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyHeterovariation getHeterovariation(String uri) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public OntologyVariation getVariation(String uri) {
    // TODO Auto-generated method stub
    return null;
  }
}
