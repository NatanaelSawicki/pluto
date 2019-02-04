package customexceptions;

import exception.ExceptionHandler;

public class PlutoIonProcessingException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoIonProcessingException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoIonProcessingException(String msg) {
        super(msg);
    }

    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }

}
