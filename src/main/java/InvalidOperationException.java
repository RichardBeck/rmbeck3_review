package main.java;

/**
 * class for matrix positions
 */

public class InvalidOperationException extends RuntimeException {

        /**
         * Constructs a <code>InvalidOperationException</code>
         * with no detail message.
         */
        public InvalidOperationException() {
                super();
        }


        public InvalidOperationException(String message) {
                super( message );
        }
}

