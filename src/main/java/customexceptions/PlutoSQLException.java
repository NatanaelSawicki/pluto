package customexceptions;

import exception.ExceptionHandler;

public class PlutoSQLException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoSQLException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoSQLException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
