package org.ceu.alf.ecollections;

import java.net.URI;

/**
 * Interface for homogeneous collections.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 */
public interface OntologyHomogeneousCollection extends OntologyCollection {

  /**
   * Method that returns the IRI of the ontology class to which the elements of the collections
   * belongs to.
   * 
   * @return the IRI of the ontology class to which the elements of the collections belongs to.
   */
  public URI getType();
}
