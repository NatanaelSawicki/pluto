package customexceptions;

import exception.ExceptionHandler;

public class PlutoSecurityException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoSecurityException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoSecurityException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
