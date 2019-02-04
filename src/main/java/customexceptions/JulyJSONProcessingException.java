package customexceptions;

import exception.ExceptionHandler;

public class JulyJSONProcessingException extends Exception {

    /**
     * Default constructor.
     */
    public JulyJSONProcessingException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyJSONProcessingException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
