package org.howard.edu.lsp.assignment4;

/**
 * Custom exception class for IntegerSet operations. This exception is thrown
 * to indicate that an operation on an IntegerSet cannot be completed properly
 * because of some specific condition, typically when the set is empty and an
 * operation requires it to have elements.
 */
public class IntegerSetException extends Exception {

    private static final long serialVersionUID = 1L;

	/**
     * Constructs an IntegerSetException with the specified detail message.
     * The detail message is saved for later retrieval by the Throwable.getMessage() method.
     *
     * @param message the detail message which provides more information about the reason
     *                for the exception being thrown.
     */
    public IntegerSetException(String message) {
        super(message);
    }
}
