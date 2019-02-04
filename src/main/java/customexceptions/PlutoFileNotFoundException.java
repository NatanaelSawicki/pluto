package customexceptions;

import exception.ExceptionHandler;

public class PlutoFileNotFoundException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoFileNotFoundException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoFileNotFoundException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
