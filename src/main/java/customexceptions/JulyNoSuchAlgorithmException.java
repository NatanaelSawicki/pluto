package customexceptions;

import exception.ExceptionHandler;

public class JulyNoSuchAlgorithmException extends Exception {

    /**
     * Default constructor.
     */
    public JulyNoSuchAlgorithmException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyNoSuchAlgorithmException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
