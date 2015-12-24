package org.ceu.ecollections.api;

/**
 * Interface for Variation collections.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 */
public interface OntologyVariation<T> extends OntologyCombination<T>, OntologyHeterovariation<T>,
    OntologyRanking<T>, OntologyVector<T> {

}
