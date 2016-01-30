package org.ceu.alf.ecollections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

import java.net.URI;

import org.apache.jena.rdf.model.Resource;


/**
 * Class that implements an ontology multiheteroset.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 */
public class StandardOntologyMultiheteroset implements OntologyMultiheteroset {
  private Multiset<String> multiheteroset;

  /**
   * Default constructor for multiheterosets. It creates an empty multiheteroset.
   */
  public StandardOntologyMultiheteroset() {
    this.multiheteroset = HashMultiset.create();
  }

  /**
   * Constructor for multiheterosets. It creates a multiheteroset with the elements of a given GUAVA
   * {@code Multiset<String>}.
   * 
   * @param multiheteroset
   *          a GUAVA {@code HashMultiset<String>}.
   */
  public StandardOntologyMultiheteroset(Multiset<String> multiheteroset) {
    this.multiheteroset = multiheteroset;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyCollection#getCollection()
   */
  @Override
  public Object getCollection() {
    return this.multiheteroset;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyCollection#cardinality()
   */
  @Override
  public int cardinality() {
    return this.multiheteroset.size();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#add(java.lang.String)
   */
  @Override
  public void add(String element) {
    this.multiheteroset.add(element);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#add(java.lang.String, int)
   */
  @Override
  public void add(String element, int times) {
    this.multiheteroset.add(element, times);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#remove(java.lang.String)
   */
  @Override
  public void remove(String element) {
    this.multiheteroset.remove(element);
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
    OntologyMultiheteroset other = (OntologyMultiheteroset) obj;
    return this.multiheteroset.equals(other.getCollection());
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return this.multiheteroset.toString();
  }

}
