package customexceptions;

import exception.ExceptionHandler;

public class JulyInvocationTargetException extends Exception {

    /**
     * Default constructor.
     */
    public JulyInvocationTargetException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyInvocationTargetException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
