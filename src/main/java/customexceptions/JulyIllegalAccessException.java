package customexceptions;

import exception.ExceptionHandler;

public class JulyIllegalAccessException extends Exception {

    /**
     * Default constructor.
     */
    public JulyIllegalAccessException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyIllegalAccessException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
