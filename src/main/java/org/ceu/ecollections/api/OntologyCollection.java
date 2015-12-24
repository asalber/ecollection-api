
package org.ceu.ecollections.api;

import java.net.URI;
import java.util.Collection;
import java.util.Set;

/**
 * Interface for collections of the E-Collections ontology.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 * @see <a href="http://aprendeconalf.es/ecollections/" target="_blank">E-Collections ontology</a>
 */

public interface OntologyCollection<T> extends Collection<T> {
  /**
   * The URI for the Collection class in the E-Collections ontology.
   */
  public static final URI Collection = URI.create("http://purl.org/ceu/eco/Collection");

  /**
   * The URI for the element class in the E-Collections ontology.
   */
  public static final URI Element = URI.create("http://purl.org/ceu/eco/Element");

  /**
   * The URI for the Collection class in the E-Collections ontology.
   */
  public static final URI Item = URI.create("http://purl.org/ceu/eco/Item");

  /**
   * The URI for the hasElement object property in the E-Collections ontology.
   */
  public static final URI hasElement = URI.create("http://purl.org/ceu/eco/hasElement");

  /**
   * The URI for the hasItem object property in the E-Collections ontology.
   */
  public static final URI hasItem = URI.create("http://purl.org/ceu/eco/hasItem");

  /**
   * The URI for the hasCardinality data property in the E-Collections ontology.
   */
  public static final URI hasCardinality = URI.create("http://purl.org/ceu/eco/hasCardinality");

  /**
   * Gets the URI identifying this collection.
   * 
   * @return an URI identifying this collection.
   */
  public URI getUri();

  /**
   * Gets the elements or objects that are part of the collection.
   * 
   * @return a set of objects being part of the collection.
   */
  public Set<T> elements();

  /**
   * Gets the cardinality of the collection, that is, the number of elements that contains the
   * collection.
   * 
   * @return an integer representing the cardinality of the collection.
   */
  public int cardinality();

}
