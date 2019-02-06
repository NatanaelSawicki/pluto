package customexceptions;

import exception.ExceptionHandler;

public class PlutoJAXBException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoJAXBException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoJAXBException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
