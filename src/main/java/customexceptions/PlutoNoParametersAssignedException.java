package customexceptions;

import exception.ExceptionHandler;

public class PlutoNoParametersAssignedException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoNoParametersAssignedException() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoNoParametersAssignedException(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
