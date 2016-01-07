package org.ceu.alf.ecollections;

import java.net.URI;

import org.apache.jena.ontology.OntModel;

/**
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
public interface CollectionOntology {
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
   * The URI for the hasContent object property in the E-Collections ontology.
   */
  public static final URI hasContentUri = URI.create("http://purl.org/ceu/eco#hasContent");

  /**
   * The URI for the hasCardinality data property in the E-Collections ontology.
   */
  public static final URI hasCardinalityUri = URI.create("http://purl.org/ceu/eco#hasCardinality");

  public OntModel getOntologyModel();

  /**
   * Method that extract a multiheteroset with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the multiheteroset.
   * @return a multiheteroset with the elements contained in the ontology.
   */
  public OntologyMultiheteroset getMultiheteroset(String uri);
}
