package org.ceu.alf.ecollections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * This class test the {@code JenaCollectionOntology} class @see org.ceu.alf.ecollections.JenaCollectionOntology
 *
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 */
public class JenaCollectionOntologyTests {
  private static final File ontologyFile =
      new File("src/test/resources/ontologies/ecollections-example.rdf");
  private static final String ns = "http://www.example.org/ecollections/example#";
  CollectionOntology ontology;

  /**
   * Method that load a collection ontology for testing.
   */
  @Before
  public void loadOntology() {
    //model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
    //reasoningModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RULE_INF);
    try {
      ontology = new JenaCollectionOntology(ontologyFile);
    } catch (FileNotFoundException e) {
      System.err.println("Error: El fichero " + ontologyFile + " no existe.");
      e.printStackTrace();
    }
  }

  /**
   * This test checks if a multiheteroset is got applying the getMultiheteroset method to an
   * ontology with a multiheteroset.
   */
  @Test
  public void getMultiheterosetTest() {
    OntologyMultiheteroset multiheteroset = new StandardOntologyMultiheteroset();
    multiheteroset.add(ns + "a1", 3);
    multiheteroset.add(ns + "b1", 2);
    multiheteroset.add(ns + "c1", 1);
    assertEquals(multiheteroset, ontology.getMultiheteroset(ns + "multiheteroset1"));
  }

  /**
   * This test checks the union of two multiheterosets.
   */
  @Test
  public void unionOfMultiheterosetTest() {
    OntologyMultiheteroset multiheteroset = new StandardOntologyMultiheteroset();
    multiheteroset.add(ns + "a1", 3);
    multiheteroset.add(ns + "b1", 2);
    multiheteroset.add(ns + "b2", 1);
    multiheteroset.add(ns + "c1", 2);
    assertEquals(multiheteroset,
        OntologyMultiheterosets.union(ontology.getMultiheteroset(ns + "multiheteroset1"),
            ontology.getMultiheteroset(ns + "multiheteroset2")));
  }

  /**
   * This test checks the union of two multiheterosets.
   */
  @Test
  public void intersectionOfMultiheterosetTest() {
    OntologyMultiheteroset multiheteroset = new StandardOntologyMultiheteroset();
    multiheteroset.add(ns + "a1", 2);
    multiheteroset.add(ns + "c1", 1);
    assertEquals(multiheteroset,
        OntologyMultiheterosets.intersection(ontology.getMultiheteroset(ns + "multiheteroset1"),
            ontology.getMultiheteroset(ns + "multiheteroset2")));
  }

}
