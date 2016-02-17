package io.techery.janet;

public class JanetInternalException extends RuntimeException {

    public JanetInternalException() {
    }

    public JanetInternalException(String message) {
        super(message);
    }

    public JanetInternalException(Throwable cause) {
        super(cause);
    }
}