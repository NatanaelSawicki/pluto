package customexceptions;

import exception.ExceptionHandler;

public class PlutoCBORProcessingException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoCBORProcessingException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoCBORProcessingException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
