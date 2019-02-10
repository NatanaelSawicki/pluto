package customexceptions;

import exception.ExceptionHandler;

public class PlutoCustomException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoCustomException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoCustomException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }
}
