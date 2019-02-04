package customexceptions;

import exception.ExceptionHandler;

public class JulyIllegalArgumentException extends Exception {

    /**
     * Default constructor.
     */
    public JulyIllegalArgumentException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyIllegalArgumentException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
