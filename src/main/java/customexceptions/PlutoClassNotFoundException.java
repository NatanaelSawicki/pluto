package customexceptions;

import exception.ExceptionHandler;

public class PlutoClassNotFoundException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoClassNotFoundException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoClassNotFoundException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
