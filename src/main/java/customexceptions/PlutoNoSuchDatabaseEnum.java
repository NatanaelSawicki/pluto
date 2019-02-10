package customexceptions;

import exception.ExceptionHandler;

public class PlutoNoSuchDatabaseEnum extends Exception {

    /**
     * Default constructor.
     */
    public PlutoNoSuchDatabaseEnum() {
    }

    /**
     * Detailed exception constructor.
     */
    public PlutoNoSuchDatabaseEnum(String msg) {
        super(msg);
    }

    public String getDetails() {
        return ExceptionHandler.getExceptionDetails(this);
    }

}
