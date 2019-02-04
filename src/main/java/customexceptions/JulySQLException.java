package customexceptions;

import exception.ExceptionHandler;

public class JulySQLException extends Exception {

    /**
     * Default constructor.
     */
    public JulySQLException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulySQLException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
