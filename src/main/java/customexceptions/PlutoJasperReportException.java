package customexceptions;

import exception.ExceptionHandler;

public class PlutoJasperReportException extends Exception {

    /**
     * Default constructor.
     */
    public PlutoJasperReportException() {
    }


    /**
     * Detailed exception constructor.
     */
    public PlutoJasperReportException(String msg) {
        super(msg);
    }
    
    public String getDetails(){
        return ExceptionHandler.getExceptionDetails(this);
    }
    
}
