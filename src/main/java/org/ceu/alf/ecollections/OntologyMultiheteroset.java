package org.ceu.alf.ecollections;

import java.net.URI;

import com.google.common.collect.Multiset;

/**
 * Interface for Multiheteroset collections.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 */
public interface OntologyMultiheteroset extends OntologyCollection {

  /**
   * Method that add a resource or literal to the multiheteroset.
   * 
   * @param element
   *          a string with the uri of the resource or the literal to be added.
   */
  public void add(String element);

  /**
   * Method that add a resource or literal to the multiheteroset the number of times specified.
   * 
   * @param element
   *          a string with the uri of the resource or the literal to be added.
   * @param times
   *          the number of times the element is added to the multiheteroset.
   */
  public void add(String element, int times);

  /**
   * Method that remove a resource or literal from the multiheteroset.
   * 
   * @param element
   *          a string with the uri of the resource or the literal to be removed.
   */
  public void remove(String element);

}
