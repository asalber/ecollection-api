package org.ceu.alf.ecollections;

/**
 * Exception thrown when trying to create a new entity with an URI already used in the ontology.
 * 
 * @author Alfredo Sánchez Alberca (asalber@ceu.es)
 *
 */
@SuppressWarnings("serial")
public class ExistingUriException extends Exception {

  /**
   * Method that constructs a new exception with null message.
   */
  public ExistingUriException() {
  }

  /**
   * Method that constructs a new exception with the given message.
   * 
   * @param message
   *          is a detail message.
   */
  public ExistingUriException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified cause.
   * 
   * @param cause
   *          the cause that provokes the exeception.
   */
  public ExistingUriException(Throwable cause) {
    super(cause);
  }

  /**
   * It constructs a new exception with the specified detail message and cause.
   * 
   * @param message
   *          the detail message.
   * @param cause
   *          the cause that provokes the exception.
   */
  public ExistingUriException(String message, Throwable cause) {
    super(message, cause);
  }

}

