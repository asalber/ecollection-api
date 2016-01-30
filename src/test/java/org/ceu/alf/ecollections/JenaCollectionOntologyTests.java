package org.ceu.alf.ecollections;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;

import org.junit.Before;
import org.junit.Test;

/*
 * This class test the {@code JenaCollectionOntology} class 
 * @see org.ceu.alf.ecollections.JenaCollectionOntology
 *
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 */
public class JenaCollectionOntologyTests {
  private static final File ontologyFile =
      new File("src/test/resources/ontologies/ecollections-example.rdf");
  private static final String ns = "http://www.example.org/ecollections/example#";
	CollectionOntologyManager ontology;

  /**
   * Method that load a collection ontology for testing.
   */
  @Before
  public void loadOntology() {
    //model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
    //reasoningModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RULE_INF);
    try {
			this.ontology = new JenaCollectionOntologyManager(ontologyFile);
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
    assertEquals(multiheteroset, this.ontology.getMultiheteroset(ns + "multiheteroset1"));
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
        OntologyMultiheterosets.union(this.ontology.getMultiheteroset(ns + "multiheteroset1"),
            this.ontology.getMultiheteroset(ns + "multiheteroset2")));
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
        OntologyMultiheterosets.intersection(
            this.ontology.getMultiheteroset(ns + "multiheteroset1"),
            this.ontology.getMultiheteroset(ns + "multiheteroset2")));
  }

  /**
   * This test checks if a multiset is got applying the getMultiset method to an ontology with a
   * multiset.
   * 
   * @throws ElementOfWrongTypeException
   */
  @Test
  public void getMultisetTest() throws ElementOfWrongTypeException {
    OntologyMultiset multiset = new StandardOntologyMultiset(URI.create(ns + "ElementA"));
    multiset.add(ns + "a1", 3);
    multiset.add(ns + "a2", 2);
    multiset.add(ns + "a3", 1);
    assertEquals(multiset, this.ontology.getMultiset(ns + "multiset1"));
  }

}
