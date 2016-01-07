package org.ceu.alf.ecollections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

import java.net.URI;

import org.apache.jena.rdf.model.Resource;


/**
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
public class StandardOntologyMultiheteroset implements OntologyMultiheteroset {
  Multiset<String> multiheteroset;

  /**
   * Default constructor for multiheterosets. It creates an empty multiheteroset.
   */
  public StandardOntologyMultiheteroset() {
    multiheteroset = HashMultiset.create();
  }

  /**
   * Constructor for multiheterosets. It creates a multiheteroset with the elements of a given GUAVA
   * {@code HashMultiset<String>}.
   */
  public StandardOntologyMultiheteroset(Multiset<String> multiset) {
    multiheteroset = multiset;
  }

  /**
   * Method that returns a reference to the GUAVA {@code Multiset<string>} used to store
   * multiheterosets.
   * 
   * @return the GUAVA {@code Multiset<string>} that contains the multiheteroset.
   */
  @Override
  public Multiset<String> getMultiset() {
    return multiheteroset;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyCollection#cardinality()
   */
  @Override
  public int cardinality() {
    return this.getMultiset().size();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#add(java.lang.String)
   */
  @Override
  public void add(String element) {
    this.getMultiset().add(element);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#add(java.lang.String, int)
   */
  @Override
  public void add(String element, int times) {
    this.getMultiset().add(element, times);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#remove(java.lang.String)
   */
  @Override
  public void remove(String element) {
    this.getMultiset().remove(element);
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof StandardOntologyMultiheteroset)) {
      return false;
    }
    StandardOntologyMultiheteroset other = (StandardOntologyMultiheteroset) obj;
    return this.getMultiset().equals(other.getMultiset());
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return this.getMultiset().toString();
  }

}
