package org.ceu.ecollections.exceptions;

/**
 * Exception thrown when trying to create a new entity with an URI already used in the ontology.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
@SuppressWarnings("serial")
public class ExistingEntityException extends Exception {

  /**
   * Method that constructs a new exception with null message.
   */
  public ExistingEntityException() {
  }

  /**
   * Method that constructs a new exception with the given message.
   * 
   * @param message
   *          is a detail message.
   */
  public ExistingEntityException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified cause and a detail message of
   * {@code (cause==null ? null : cause.toString())} (which typically contains the class and detail
   * message of cause).
   * 
   * @param cause
   *          the cause. A {@code null} value is permitted, and indicates that the cause is
   *          nonexistent or unknown.)
   */
  public ExistingEntityException(Throwable cause) {
    super(cause);
  }

  /**
   * It constructs a new exception with the specified detail message and cause.
   * 
   * @param message
   *          the detail message.
   * @param cause
   *          the cause. A {@code null} value is permitted, and indicates that the cause is
   *          nonexistent or unknown.)
   */
  public ExistingEntityException(String message, Throwable cause) {
    super(message, cause);
  }

}

