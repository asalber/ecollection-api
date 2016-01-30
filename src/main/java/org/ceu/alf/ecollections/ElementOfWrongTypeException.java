package org.ceu.alf.ecollections;

/**
 * Exception thrown when trying to add an element to an homogeneous collection and the element not
 * belongs to the ontology class of the elements of the collection.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
public class ElementOfWrongTypeException extends Exception {

  /**
   * Method that constructs a new exception with null message.
   */
  public ElementOfWrongTypeException() {
  }

  /**
   * Method that constructs a new exception with the given message.
   * 
   * @param message
   *          is a detail message.
   */
  public ElementOfWrongTypeException(String message) {
    super(message);
  }

  /**
   * Method that construct a new exception with the given cause.
   * 
   * @param cause
   *          the cause that provokes the exception.
   */
  public ElementOfWrongTypeException(Throwable cause) {
    super(cause);
  }

  /**
   * Method that construct a new exception with the given message and cause.
   * 
   * @param message
   *          a detail message.
   * @param cause
   *          the cause that provokes the exception.
   */
  public ElementOfWrongTypeException(String message, Throwable cause) {
    super(message, cause);
  }

}
