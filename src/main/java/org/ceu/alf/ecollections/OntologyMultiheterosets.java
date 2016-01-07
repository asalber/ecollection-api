/**
 * 
 */
package org.ceu.alf.ecollections;

import com.google.common.collect.HashMultiset;
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
  public static OntologyMultiheteroset union(OntologyMultiheteroset multiheteroset1,
      OntologyMultiheteroset multiheteroset2) {
    return new StandardOntologyMultiheteroset(
        Multisets.union(multiheteroset1.getMultiset(), multiheteroset2.getMultiset()));
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
  public static OntologyMultiheteroset intersection(OntologyMultiheteroset multiheteroset1,
      OntologyMultiheteroset multiheteroset2) {
    return new StandardOntologyMultiheteroset(
        Multisets.intersection(multiheteroset1.getMultiset(), multiheteroset2.getMultiset()));
  }
}
