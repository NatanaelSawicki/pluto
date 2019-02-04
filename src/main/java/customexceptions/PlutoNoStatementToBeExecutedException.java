package customexceptions;

import exception.ExceptionHandler;

public class PlutoNoStatementToBeExecutedException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoNoStatementToBeExecutedException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoNoStatementToBeExecutedException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
