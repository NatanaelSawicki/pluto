package customexceptions;

import exception.ExceptionHandler;

public class JulySecurityException extends Exception {

    /**
     * Default constructor.
     */
    public JulySecurityException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulySecurityException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
