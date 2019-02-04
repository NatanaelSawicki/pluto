package customexceptions;

import exception.ExceptionHandler;

public class JulyNoSuchMethodException extends Exception {

    /**
     * Default constructor.
     */
    public JulyNoSuchMethodException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyNoSuchMethodException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
