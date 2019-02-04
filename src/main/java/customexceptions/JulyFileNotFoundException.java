package customexceptions;

import exception.ExceptionHandler;

public class JulyFileNotFoundException extends Exception {

    /**
     * Default constructor.
     */
    public JulyFileNotFoundException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyFileNotFoundException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
