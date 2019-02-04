package customexceptions;

import exception.ExceptionHandler;

public class PlutoYAMLProcessingException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoYAMLProcessingException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoYAMLProcessingException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
