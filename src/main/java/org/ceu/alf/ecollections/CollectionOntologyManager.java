package org.ceu.alf.ecollections;

import java.net.URI;

import org.apache.jena.ontology.OntModel;

/**
 * Interface for managing an ontology that uses the E-Collections ontology. 
 * This is the main interface and every class that want to access an ontology build with the E-Collections ontology must to implement it. 
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
public interface CollectionOntologyManager {
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

  /**
   * The URI for the Multiheteroset class in the E-Collections ontology.
   */
  public static final URI MultiheterosetUri = URI.create("http://purl.org/ceu/eco#Multiheteroset");

  /**
   * The URI for the Multiset class in the E-Collections ontology.
   */
  public static final URI MultisetUri = URI.create("http://purl.org/ceu/eco#Multiset");

  /**
   * The URI for the Heteroset class in the E-Collections ontology.
   */
  public static final URI HeterosetUri = URI.create("http://purl.org/ceu/eco#Heteroset");

  /**
   * The URI for the List class in the E-Collections ontology.
   */
  public static final URI ListUri = URI.create("http://purl.org/ceu/eco#List");

  /**
   * The URI for the Box class in the E-Collections ontology.
   */
  public static final URI BoxUri = URI.create("http://purl.org/ceu/eco#Box");

  /**
   * The URI for the Set class in the E-Collections ontology.
   */
  public static final URI SetUri = URI.create("http://purl.org/ceu/eco#Set");

  /**
   * The URI for the Sequence class in the E-Collections ontology.
   */
  public static final URI SequenceUri = URI.create("http://purl.org/ceu/eco#Sequence");

  /**
   * The URI for the Multicombination class in the E-Collections ontology.
   */
  public static final URI MulticombinationUri =
      URI.create("http://purl.org/ceu/eco#Multicombination");

  /**
   * The URI for the Heteroranking class in the E-Collections ontology.
   */
  public static final URI HeterorankingUri = URI.create("http://purl.org/ceu/eco#Heteroranking");

  /**
   * The URI for the Heterocombination class in the E-Collections ontology.
   */
  public static final URI HeterocombinationUri =
      URI.create("http://purl.org/ceu/eco#Heterocombination");

  /**
   * The URI for the Tuple class in the E-Collections ontology.
   */
  public static final URI TupleUri = URI.create("http://purl.org/ceu/eco#Tuple");

  /**
   * The URI for the Ranking class in the E-Collections ontology.
   */
  public static final URI RankingUri = URI.create("http://purl.org/ceu/eco#Ranking");

  /**
   * The URI for the Combination class in the E-Collections ontology.
   */
  public static final URI CombinationUri = URI.create("http://purl.org/ceu/eco#Combination");

  /**
   * The URI for the Vector class in the E-Collections ontology.
   */
  public static final URI VectorUri = URI.create("http://purl.org/ceu/eco#Vector");

  /**
   * The URI for the Heterovariation class in the E-Collections ontology.
   */
  public static final URI HeterovariationUri =
      URI.create("http://purl.org/ceu/eco#Heterovariation");

  /**
   * The URI for the Variation class in the E-Collections ontology.
   */
  public static final URI VariationUri = URI.create("http://purl.org/ceu/eco#Variation");

  /**
   * The URI for the hasElementsOfType property in the E-Collections ontology.
   */
  public static final URI hasElementsOfTypeUri =
      URI.create("http://purl.org/ceu/eco#hasElementsOfType");

  /**
   * Method that returns the ontology model that stores the ontology.
   * 
   * @return the ontology model that stores the ontology.
   */
  public Object getOntologyModel();

  /**
   * Method that extract a multiheteroset with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the multiheteroset.
   * @return a multiheteroset with its elements contained in the ontology.
   */
  public OntologyMultiheteroset getMultiheteroset(String uri);

  /**
   * Method that extract a multiset with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the multiset.
   * @return a multiset with its elements contained in the ontology.
   * @throws ElementOfWrongTypeException
   *           Exception thrown when trying to add an element to an homogeneous collection and the
   *           element not belongs to the ontology class of the elements of the collection.
   */
  public OntologyMultiset getMultiset(String uri) throws ElementOfWrongTypeException;

  /**
   * Method that extract a heteroset with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the heteroset.
   * @return a heteroset with its elements contained in the ontology.
   */
  public OntologyHeteroset getHeteroset(String uri);

  /**
   * Method that extract a list with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the list.
   * @return a list with its elements contained in the ontology.
   */
  public OntologyList getList(String uri);

  /**
   * Method that extract a box with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the box.
   * @return a box with its elements contained in the ontology.
   */
  public OntologyBox getBox(String uri);

  /**
   * Method that extract a set with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the set.
   * @return a set with its elements contained in the ontology.
   */
  public OntologySet getSet(String uri);

  /**
   * Method that extract a sequence with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the sequence.
   * @return a sequence with its elements contained in the ontology.
   */
  public OntologySequence getSequence(String uri);

  /**
   * Method that extract a multicombination with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the multicombination.
   * @return a multicombination with its elements contained in the ontology.
   */
  public OntologyMulticombination getMulticombination(String uri);

  /**
   * Method that extract a heteroranking with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the heteroranking.
   * @return a heteroranking with its elements contained in the ontology.
   */
  public OntologyHeteroranking getHeteroranking(String uri);

  /**
   * Method that extract a heterocombination with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the heterocombination.
   * @return a heterocombination with its elements contained in the ontology.
   */
  public OntologyHeterocombination getHeterocombination(String uri);

  /**
   * Method that extract a tuple with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the tuple.
   * @return a tuple with its elements contained in the ontology.
   */
  public OntologyTuple getTuple(String uri);

  /**
   * Method that extract a ranking with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the ranking.
   * @return a ranking with its elements contained in the ontology.
   */
  public OntologyRanking getRanking(String uri);

  /**
   * Method that extract a combination with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the combination.
   * @return a combination with its elements contained in the ontology.
   */
  public OntologyCombination getCombination(String uri);

  /**
   * Method that extract a vector with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the vector.
   * @return a vector with its elements contained in the ontology.
   */
  public OntologyVector getVector(String uri);

  /**
   * Method that extract a heterovariation with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the heterovariation.
   * @return a heterovariation with its elements contained in the ontology.
   */
  public OntologyHeterovariation getHeterovariation(String uri);

  /**
   * Method that extract a variation with a given uri from the ontology.
   * 
   * @param uri
   *          the uri of the variation.
   * @return a variation with its elements contained in the ontology.
   */
  public OntologyVariation getVariation(String uri);

}
