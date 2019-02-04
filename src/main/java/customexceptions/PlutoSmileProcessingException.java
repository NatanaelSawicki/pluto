package customexceptions;

import exception.ExceptionHandler;

public class PlutoSmileProcessingException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoSmileProcessingException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoSmileProcessingException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
