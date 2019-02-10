package customexceptions;

import exception.ExceptionHandler;

public class PlutoAvroProcessingException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoAvroProcessingException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoAvroProcessingException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
