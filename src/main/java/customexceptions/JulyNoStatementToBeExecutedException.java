package customexceptions;

import exception.ExceptionHandler;

public class JulyNoStatementToBeExecutedException extends Exception {

    /**
     * Default constructor.
     */
    public JulyNoStatementToBeExecutedException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyNoStatementToBeExecutedException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
