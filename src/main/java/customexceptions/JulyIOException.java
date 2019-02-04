package customexceptions;

import exception.ExceptionHandler;

public class JulyIOException extends Exception {

    /**
     * Default constructor.
     */
    public JulyIOException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyIOException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
