
package org.ceu.alf.ecollections;

import java.net.URI;
import java.util.Collection;
import java.util.Set;

/**
 * Interface for collections of the E-Collections ontology.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 * @see <a href="http://aprendeconalf.es/ecollections/" target="_blank">E-Collections ontology</a>
 */
public interface OntologyCollection {

  /**
   * Method that returns a reference to the <a href=
   * "http://google.github.io/guava/releases/19.0/api/docs/com/google/common/collect/package-summary.html">
   * GUAVA collection</a> used to store the ontology collection.
   * 
   * @return the GUAVA collection that contains the ontology collection.
   */
  public Object getCollection();

  //
  // /**
  // * Gets the elements or objects that are part of the collection.
  // *
  // * @return a set of objects being part of the collection.
  // */
  // public Set<E> elements();
  //
  /**
   * Gets the cardinality of the collection, that is, the number of elements that contains the
   * collection.
   *
   * @return an integer representing the cardinality of the collection.
   */
  public int cardinality();

}
