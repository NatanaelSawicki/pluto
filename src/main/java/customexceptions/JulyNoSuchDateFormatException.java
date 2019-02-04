package customexceptions;

import exception.ExceptionHandler;

public class JulyNoSuchDateFormatException extends Exception {

    /**
     * Default constructor.
     */
    public JulyNoSuchDateFormatException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyNoSuchDateFormatException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
