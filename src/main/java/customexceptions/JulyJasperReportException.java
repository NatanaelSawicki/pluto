package customexceptions;

import exception.ExceptionHandler;

public class JulyJasperReportException extends Exception {

    /**
     * Default constructor.
     */
    public JulyJasperReportException() {
    }


    /**
     * Detailed exception constructor.
     */
    public JulyJasperReportException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
