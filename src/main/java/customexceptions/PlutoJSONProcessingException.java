package customexceptions;

import exception.ExceptionHandler;

public class PlutoJSONProcessingException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoJSONProcessingException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoJSONProcessingException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
