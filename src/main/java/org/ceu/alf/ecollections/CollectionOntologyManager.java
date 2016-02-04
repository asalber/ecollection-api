package org.ceu.alf.ecollections;

import java.net.URI;

/**
 * Interface for managing an ontology that uses the E-Collections ontology.
 * 
 * This is the main interface and every class that want to access an ontology build with the E-Collections ontology must
 * to implement it.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
public interface CollectionOntologyManager {
  /**
   * is the URI for the Collection class in the E-Collections ontology.
   */
  URI COLLECTION_URI = URI.create("http://purl.org/ceu/eco#Collection");

  /**
   * is the URI for the Item class in the E-Collections ontology.
   */
  URI ITEM_URI = URI.create("http://purl.org/ceu/eco#Item");

  /**
   * is the URI for the hasElement object property in the E-Collections ontology.
   */
  URI HASELEMENT_URI = URI.create("http://purl.org/ceu/eco#hasElement");

  /**
   * is the URI for the hasItem object property in the E-Collections ontology.
   */
  URI HASITEM_URI = URI.create("http://purl.org/ceu/eco#hasItem");

  /**
   * is the URI for the hasContent object property in the E-Collections ontology.
   */
  URI HASCONTENT_URI = URI.create("http://purl.org/ceu/eco#hasContent");

  /**
   * is the URI for the hasCardinality data property in the E-Collections ontology.
   */
  URI HASCARDINALITY_URI = URI.create("http://purl.org/ceu/eco#hasCardinality");

  /**
   * is the URI for the Multiheteroset class in the E-Collections ontology.
   */
  URI MULTIHETEROSET_URI = URI.create("http://purl.org/ceu/eco#Multiheteroset");

  /**
   * is the URI for the Multiset class in the E-Collections ontology.
   */
  URI MULTISET_URI = URI.create("http://purl.org/ceu/eco#Multiset");

  /**
   * is the URI for the Heteroset class in the E-Collections ontology.
   */
  URI HETEROSET_URI = URI.create("http://purl.org/ceu/eco#Heteroset");

  /**
   * is the URI for the List class in the E-Collections ontology.
   */
  URI LIST_URI = URI.create("http://purl.org/ceu/eco#List");

  /**
   * is the URI for the Box class in the E-Collections ontology.
   */
  URI BOX_URI = URI.create("http://purl.org/ceu/eco#Box");

  /**
   * is the URI for the Set class in the E-Collections ontology.
   */
  URI SET_URI = URI.create("http://purl.org/ceu/eco#Set");

  /**
   * is the URI for the Sequence class in the E-Collections ontology.
   */
  URI SEQUENCE_URI = URI.create("http://purl.org/ceu/eco#Sequence");

  /**
   * is the URI for the Multicombination class in the E-Collections ontology.
   */
  URI MULTICOMBINATION_URI =
      URI.create("http://purl.org/ceu/eco#Multicombination");

  /**
   * is the URI for the Heteroranking class in the E-Collections ontology.
   */
  URI HETERORANKING_URI = URI.create("http://purl.org/ceu/eco#Heteroranking");

  /**
   * is the URI for the Heterocombination class in the E-Collections ontology.
   */
  URI HETEROCOMBINATION_URI =
      URI.create("http://purl.org/ceu/eco#Heterocombination");

  /**
   * is the URI for the Tuple class in the E-Collections ontology.
   */
  URI TUPLE_URI = URI.create("http://purl.org/ceu/eco#Tuple");

  /**
   * is the URI for the Ranking class in the E-Collections ontology.
   */
  URI RANKING_URI = URI.create("http://purl.org/ceu/eco#Ranking");

  /**
   * is the URI for the Combination class in the E-Collections ontology.
   */
  URI COMBINATION_URI = URI.create("http://purl.org/ceu/eco#Combination");

  /**
   * is the URI for the Vector class in the E-Collections ontology.
   */
  URI VECTOR_URI = URI.create("http://purl.org/ceu/eco#Vector");

  /**
   * is the URI for the Heterovariation class in the E-Collections ontology.
   */
  URI HETEROVARIATION_URI =
      URI.create("http://purl.org/ceu/eco#Heterovariation");

  /**
   * is the URI for the Variation class in the E-Collections ontology.
   */
  URI VARIATION_URI = URI.create("http://purl.org/ceu/eco#Variation");

  /**
   * is the URI for the hasElementsOfType property in the E-Collections ontology.
   */
  URI HASELEMENTSOFTYPE_URI =
      URI.create("http://purl.org/ceu/eco#hasElementsOfType");

  /**
   * Method that returns the ontology model that stores the ontology.
   * 
   * @return the ontology model that stores the ontology.
   */
  Object getOntologyModel();

  /**
   * Method that extract a multiheteroset with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the multiheteroset.
   * @return a multiheteroset with its elements contained in the ontology.
   */
  OntologyMultiheteroset getMultiheteroset(String uri);

  /**
   * Method that extract a multiset with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the multiset.
   * @return a multiset with its elements contained in the ontology.
   * @throws ElementOfWrongTypeException
   *           Exception thrown when trying to add an element to an homogeneous collection and the
   *           element not belongs to the ontology class of the elements of the collection.
   */
  OntologyMultiset getMultiset(String uri) throws ElementOfWrongTypeException;

  /**
   * Method that extract a heteroset with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the heteroset.
   * @return a heteroset with its elements contained in the ontology.
   */
  OntologyHeteroset getHeteroset(String uri);

  /**
   * Method that extract a list with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the list.
   * @return a list with its elements contained in the ontology.
   */
  OntologyList getList(String uri);

  /**
   * Method that extract a box with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the box.
   * @return a box with its elements contained in the ontology.
   */
  OntologyBox getBox(String uri);

  /**
   * Method that extract a set with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the set.
   * @return a set with its elements contained in the ontology.
   */
  OntologySet getSet(String uri);

  /**
   * Method that extract a sequence with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the sequence.
   * @return a sequence with its elements contained in the ontology.
   */
  OntologySequence getSequence(String uri);

  /**
   * Method that extract a multicombination with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the multicombination.
   * @return a multicombination with its elements contained in the ontology.
   */
  OntologyMulticombination getMulticombination(String uri);

  /**
   * Method that extract a heteroranking with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the heteroranking.
   * @return a heteroranking with its elements contained in the ontology.
   */
  OntologyHeteroranking getHeteroranking(String uri);

  /**
   * Method that extract a heterocombination with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the heterocombination.
   * @return a heterocombination with its elements contained in the ontology.
   */
  OntologyHeterocombination getHeterocombination(String uri);

  /**
   * Method that extract a tuple with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the tuple.
   * @return a tuple with its elements contained in the ontology.
   */
  OntologyTuple getTuple(String uri);

  /**
   * Method that extract a ranking with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the ranking.
   * @return a ranking with its elements contained in the ontology.
   */
  OntologyRanking getRanking(String uri);

  /**
   * Method that extract a combination with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the combination.
   * @return a combination with its elements contained in the ontology.
   */
  OntologyCombination getCombination(String uri);

  /**
   * Method that extract a vector with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the vector.
   * @return a vector with its elements contained in the ontology.
   */
  OntologyVector getVector(String uri);

  /**
   * Method that extract a heterovariation with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the heterovariation.
   * @return a heterovariation with its elements contained in the ontology.
   */
  OntologyHeterovariation getHeterovariation(String uri);

  /**
   * Method that extract a variation with a given uri from the ontology.
   * 
   * @param uri
   *          is the URI of the variation.
   * @return a variation with its elements contained in the ontology.
   */
  OntologyVariation getVariation(String uri);

}
