package org.ceu.ecollections.api;

import org.ceu.ecollections.exceptions.ExistingEntityException;

import java.net.URI;

/**
 * Interface for managing the creation of collections of the E-Collections ontology.
 * <p>
 * All the collections should be created using this interface, that allows creation of new
 * collections, loading and saving existing collections.
 * </p>
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 * @see <a href="http://aprendeconalf.es/ecollections/" target="_blank">E-Collections ontology</a>.
 */
public interface OntologyCollectionFactory<T> {

  /**
   * Method that set the base ontology for the collection factory.
   * 
   * @param id
   *          is the URI of the ontology.
   */
  void setOntology(URI id);

  /**
   * Method that creates a new homogeneous collection of the E-Collections ontology with the given
   * URI.
   * 
   * @param id
   *          is an URI.
   * @return a new homogeneous collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyHomogeneousCollection<T> createHomogeneousCollection(URI id)
      throws ExistingEntityException;

  /**
   * Method that creates a new homogeneous collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new homogeneous collection.
   */
  OntologyHomogeneousCollection<T> createHomogeneousCollection();

  /**
   * Method that creates a new uniqueness collection of the E-Collections ontology with the given
   * URI.
   * 
   * @param id
   *          is an URI.
   * @return a new uniqueness collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyUniquenessCollection<T> createUniquenessCollection(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new uniqueness collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new uniqueness collection.
   */
  OntologyUniquenessCollection<T> createUniquenessCollection();

  /**
   * Method that creates a new ordered collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new ordered collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyOrderedCollection<T> createOrderedCollection(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new ordered collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new ordered collection.
   */
  OntologyOrderedCollection<T> createOrderedCollection();

  /**
   * Method that creates a new fixed cardinality collection of the E-Collections ontology with the
   * given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new fixed cardinality collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyFixedCardinalityCollection<T> createFixedCardinalityCollection(URI id)
      throws ExistingEntityException;

  /**
   * Method that creates a new fixed cardinality collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new fixed cardinality collection.
   */
  OntologyFixedCardinalityCollection<T> createFixedCardinalityCollection();

  /**
   * Method that creates a new Multiheteroset collection of the E-Collections ontology with the
   * given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Multiheteroset collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyMultiheteroset<T> createMultiheteroset(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Multiheteroset collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Multiheteroset collection.
   */
  OntologyMultiheteroset<T> createMultiheteroset();

  /**
   * Method that creates a new Heteroset collection of the E-Collections ontology with the given
   * URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Heteroset collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyHeteroset<T> createHeteroset(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Heteroset collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Heteroset collection.
   */
  OntologyHeteroset<T> createHeteroset();

  /**
   * Method that creates a new Multiset collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Multiset collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyMultiset<T> createMultiset(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Multiset collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Multiset collection.
   */
  OntologyMultiset<T> createMultiset();

  /**
   * Method that creates a new List collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new List collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyList<T> createList(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new List collection of the E-Collections ontology with an auto-generated
   * URI.
   * 
   * @return a new List collection.
   */
  OntologyList<T> createList();

  /**
   * Method that creates a new Box collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Box collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyBox<T> createBox(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Box collection of the E-Collections ontology with an auto-generated
   * URI.
   * 
   * @return a new Box collection.
   */
  OntologyBox<T> createBox();

  /**
   * Method that creates a new Set collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Set collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologySet<T> createSet(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Set collection of the E-Collections ontology with an auto-generated
   * URI.
   * 
   * @return a new Set collection.
   */
  OntologySet<T> createSet();

  /**
   * Method that creates a new Heteroranking collection of the E-Collections ontology with the given
   * URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Heteroranking collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyHeteroranking<T> createHeteroranking(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Heteroranking collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Heteroranking collection.
   */
  OntologyHeteroranking<T> createHeteroranking();

  /**
   * Method that creates a new Heterocombination collection of the E-Collections ontology with the
   * given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Heterocombination collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyHeterocombination<T> createHeterocombination(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Heterocombination collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Heterocombination collection.
   */
  OntologyHeterocombination<T> createHeterocombination();

  /**
   * Method that creates a new Sequence collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Sequence collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologySequence<T> createSequence(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Sequence collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Sequence collection.
   */
  OntologySequence<T> createSequence();

  /**
   * Method that creates a new Multicombination collection of the E-Collections ontology with the
   * given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Multicombination collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyMulticombination<T> createMulticombination(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Multicombination collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Multicombination collection.
   */
  OntologyMulticombination<T> createMulticombination();

  /**
   * Method that creates a new Tuple collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Tuple collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyTuple<T> createTuple(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Tuple collection of the E-Collections ontology with an auto-generated
   * URI.
   * 
   * @return a new Tuple collection.
   */
  OntologyTuple<T> createTuple();

  /**
   * Method that creates a newRanking collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a newRanking collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyRanking<T> createRanking(URI id) throws ExistingEntityException;

  /**
   * Method that creates a newRanking collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a newRanking collection.
   */
  OntologyRanking<T> createRanking();

  /**
   * Method that creates a new Combination collection of the E-Collections ontology with the given
   * URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Combination collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyCombination<T> createCombination(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Combination collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Combination collection.
   */
  OntologyCombination<T> createCombination();

  /**
   * Method that creates a new Heterovariation collection of the E-Collections ontology with the
   * given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Heterovariation collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyHeterovariation<T> createHeterovariation(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Heterovariation collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Heterovariation collection.
   */
  OntologyHeterovariation<T> createHeterovariation();

  /**
   * Method that creates a new Vector collection of the E-Collections ontology with the given URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Vector collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyVector<T> createVector(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Vector collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Vector collection.
   */
  OntologyVector<T> createVector();

  /**
   * Method that creates a new Variation collection of the E-Collections ontology with the given
   * URI.
   * 
   * @param id
   *          is an URI.
   * @return a new Variation collection.
   * @throws ExistingEntityException
   *           an exception thrown when the given URI is already used in the ontology.
   */
  OntologyVariation<T> createVariation(URI id) throws ExistingEntityException;

  /**
   * Method that creates a new Variation collection of the E-Collections ontology with an
   * auto-generated URI.
   * 
   * @return a new Variation collection.
   */
  OntologyVariation<T> createVariation();
}
