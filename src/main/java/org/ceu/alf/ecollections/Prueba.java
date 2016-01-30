package org.ceu.alf.ecollections;

import java.io.File;
import java.io.FileNotFoundException;

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
		CollectionOntologyManager ontology;
    try {
			ontology = new JenaCollectionOntologyManager(ontologyFile);
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
