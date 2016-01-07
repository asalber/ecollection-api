package org.ceu.alf.ecollections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Selector;
import org.apache.jena.rdf.model.SimpleSelector;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.RDF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* @author alf
 *
 */
public class Prueba {
  private static final Logger LOG = LoggerFactory.getLogger(Prueba.class);
  /**
   * Class prueba
   * @param args
   */
  public static void main(String[] args) {
    File ontologyFile = new File("src/test/resources/ontologies/ecollections-example.rdf");
    CollectionOntology ontology;
    try {
      ontology = new JenaCollectionOntology(ontologyFile);
      System.out.println(ontology
          .getMultiheteroset("http://www.example.org/ecollections/example#multiheteroset1"));
      // System.out.println(ontology.getOntologyModel().size());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    // SimpleSelector selector = new SimpleSelector(null, null, (RDFNode)null) {
    // public boolean selects(Statement st) {
    // return st.getSubject().equals(
    // model.createResource("http://www.example.org/ecollections/example#multiheteroset1"));
    // }
    // };
    // StmtIterator iter1 = model.listStatements(selector);
    // while (iter1.hasNext()) {
    // Statement stmt = iter1.next();
    // System.out.println("Statement: " + stmt);
    // }

  }

}
