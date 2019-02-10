package customexceptions;

import exception.ExceptionHandler;

public class PlutoNoSuchMethodException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoNoSuchMethodException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoNoSuchMethodException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
