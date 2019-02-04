package customexceptions;

import exception.ExceptionHandler;

public class JulyNoEstablishedConnectionException extends Exception {

    /**
     * Default constructor.
     */
    public JulyNoEstablishedConnectionException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyNoEstablishedConnectionException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
