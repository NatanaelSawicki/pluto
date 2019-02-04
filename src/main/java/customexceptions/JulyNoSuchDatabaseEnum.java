package customexceptions;

import exception.ExceptionHandler;

public class JulyNoSuchDatabaseEnum extends Exception {

    /**
     * Default constructor.
     */
    public JulyNoSuchDatabaseEnum() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyNoSuchDatabaseEnum(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
