package customexceptions;

import exception.ExceptionHandler;

public class PlutoNullPointerException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoNullPointerException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoNullPointerException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
