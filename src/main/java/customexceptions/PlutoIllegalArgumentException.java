package customexceptions;

import exception.ExceptionHandler;

public class PlutoIllegalArgumentException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoIllegalArgumentException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoIllegalArgumentException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
