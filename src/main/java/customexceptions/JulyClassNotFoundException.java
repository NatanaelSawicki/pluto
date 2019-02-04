package customexceptions;

import exception.ExceptionHandler;

public class JulyClassNotFoundException extends Exception {

    /**
     * Default constructor.
     */
    public JulyClassNotFoundException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyClassNotFoundException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
