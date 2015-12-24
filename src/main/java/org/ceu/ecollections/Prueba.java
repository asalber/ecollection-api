/**
 * 
 */

package org.ceu.ecollections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* @author alf
 *
 */
public class Prueba {
  private static final Logger LOG = LoggerFactory.getLogger(Prueba.class);
  /**
   * Class prueba
   * @param args
   */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        LOG.info("Hello {}", i);
      } else {
        LOG.debug("I am on index {}", i);
      }
    }
  }

}
