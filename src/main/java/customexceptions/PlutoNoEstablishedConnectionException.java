package customexceptions;

import exception.ExceptionHandler;

public class PlutoNoEstablishedConnectionException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoNoEstablishedConnectionException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoNoEstablishedConnectionException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
