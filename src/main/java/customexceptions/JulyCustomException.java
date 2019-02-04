package customexceptions;

import exception.ExceptionHandler;

public class JulyCustomException extends Exception {

    /**
     * Default constructor.
     */
    public JulyCustomException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyCustomException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
}
