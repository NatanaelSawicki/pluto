package customexceptions;

import exception.ExceptionHandler;

public class PlutoNoSuchDateFormatException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoNoSuchDateFormatException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoNoSuchDateFormatException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
