
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
   * The URI for the Collection class in the E-Collections ontology.
   */
  public static final URI CollectionUri = URI.create("http://purl.org/ceu/eco#Collection");

  /**
   * The URI for the Item class in the E-Collections ontology.
   */
  public static final URI ItemUri = URI.create("http://purl.org/ceu/eco#Item");

  /**
   * The URI for the hasElement object property in the E-Collections ontology.
   */
  public static final URI hasElementUri = URI.create("http://purl.org/ceu/eco#hasElement");

  /**
   * The URI for the hasItem object property in the E-Collections ontology.
   */
  public static final URI hasItemUri = URI.create("http://purl.org/ceu/eco#hasItem");

  /**
   * The URI for the hasCardinality data property in the E-Collections ontology.
   */
  public static final URI hasCardinalityUri = URI.create("http://purl.org/ceu/eco#hasCardinality");

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
