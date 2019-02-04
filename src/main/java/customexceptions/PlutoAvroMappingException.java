package customexceptions;

import exception.ExceptionHandler;

public class PlutoAvroMappingException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoAvroMappingException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoAvroMappingException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
