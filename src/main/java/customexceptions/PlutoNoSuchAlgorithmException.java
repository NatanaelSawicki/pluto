package customexceptions;

import exception.ExceptionHandler;

public class PlutoNoSuchAlgorithmException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoNoSuchAlgorithmException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoNoSuchAlgorithmException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
