/**
 * 
 */
package org.ceu.alf.ecollections;

import java.net.URI;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Class that implements an ontology multiset.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
public class StandardOntologyMultiset implements OntologyMultiset {
  private Multiset<String> multiset;
  private URI type;

  /**
   * Default constructor for multisets. It creates an empty multiset.
   */
  public StandardOntologyMultiset() {
    this.multiset = HashMultiset.create();
    this.type = URI.create("http://www.w3.org/2002/07/owl#Thing");
  }

  /**
   * Constructor for multisets. It creates an empty multiset of the given type.
   * 
   * @param uri
   *          the URI of the ontology class to which elements of the collection belongs to.
   */
  public StandardOntologyMultiset(URI uri) {
    this.multiset = HashMultiset.create();
    this.type = uri;
  }

  /**
   * Constructor for multisets. It creates a multiset with the elements of a given GUAVA
   * {@code Multiset<String>}.
   * 
   * @param multiset
   *          a GUAVA {@code Multiset<String>}.
   * @param uri
   *          the URI of the ontology class to which elements of the collection belongs to.
   */
  public StandardOntologyMultiset(Multiset<String> multiset, URI uri) {
    this.multiset = multiset;
    this.type = uri;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyCollection#getCollection()
   */
  @Override
  public Object getCollection() {
    return this.multiset;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyHomogeneousCollection#getType()
   */
  @Override
  public URI getType() {
    return this.type;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyCollection#cardinality()
   */
  @Override
  public int cardinality() {
    return this.multiset.size();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#add(java.lang.String)
   */
  @Override
  public void add(String element) {
    this.multiset.add(element);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#add(java.lang.String, int)
   */
  @Override
  public void add(String element, int times) {
    this.multiset.add(element, times);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.ceu.alf.ecollections.OntologyMultiheteroset#remove(java.lang.String)
   */
  @Override
  public void remove(String element) {
    this.multiset.remove(element);
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
    if (!(obj instanceof StandardOntologyMultiset)) {
      return false;
    }
    OntologyMultiset other = (OntologyMultiset) obj;
    if (!this.getType().equals(other.getType())) {
      return false;
    } else {
      return this.multiset.equals(other.getCollection());
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Type of elements: " + this.getType().toString() + ", Elements: "
        + this.multiset.toString();
  }

}
