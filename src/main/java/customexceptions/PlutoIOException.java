package customexceptions;

import exception.ExceptionHandler;

public class PlutoIOException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoIOException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoIOException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
