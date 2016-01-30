package org.ceu.alf.ecollections;

import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

/**
 * This class provides static utility methods for creating and working with multiheterosets
 * instances.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
public final class OntologyMultiheterosets {
  /**
   * Method that returns the union of two multiheterosets. The union of two multiheterosets A and B
   * is a multiheteroset with the elements of A and B, where the count of every element is the
   * maximum of its counts in A and B.
   * 
   * @param multiheteroset1
   *          a multiheteroset.
   * @param multiheteroset2
   *          a multiheteroset.
   * @return a new multiheteroset that is the union of the multiheterosets {@code multiheteroset1}
   *         and {@code multiheteroset2}.
   */
  @SuppressWarnings("unchecked")
  public static OntologyMultiheteroset union(OntologyMultiheteroset multiheteroset1,
      OntologyMultiheteroset multiheteroset2) {
    return new StandardOntologyMultiheteroset(
        Multisets.union((Multiset<String>) multiheteroset1.getCollection(),
            (Multiset<String>) multiheteroset2.getCollection()));
  }

  /**
   * Method that returns the intersection of two multiheterosets. The intersection of two
   * multiheterosets A and B is a multiheteroset with the common elements of A and B, where the
   * count of every element is the minimum of its counts in A and B.
   * 
   * @param multiheteroset1
   *          a multiheteroset.
   * @param multiheteroset2
   *          a multiheteroset.
   * @return a new multiheteroset that is the intersection of the multiheterosets
   *         {@code multiheteroset1} and {@code multiheteroset2}.
   */
  @SuppressWarnings("unchecked")
  public static OntologyMultiheteroset intersection(OntologyMultiheteroset multiheteroset1,
      OntologyMultiheteroset multiheteroset2) {
    return new StandardOntologyMultiheteroset(
        Multisets.intersection((Multiset<String>) multiheteroset1.getCollection(),
            (Multiset<String>) multiheteroset2.getCollection()));
  }
}
