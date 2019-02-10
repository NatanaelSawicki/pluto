package customexceptions;

import exception.ExceptionHandler;

public class PlutoInvocationTargetException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoInvocationTargetException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoInvocationTargetException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
