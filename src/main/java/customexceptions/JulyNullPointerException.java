package customexceptions;

import exception.ExceptionHandler;

public class JulyNullPointerException extends Exception {

    /**
     * Default constructor.
     */
    public JulyNullPointerException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyNullPointerException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
