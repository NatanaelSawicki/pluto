package customexceptions;

import exception.ExceptionHandler;

public class PlutoIllegalAccessException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoIllegalAccessException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoIllegalAccessException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
