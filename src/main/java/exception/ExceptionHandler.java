package exception;

import org.apache.commons.lang.exception.ExceptionUtils;

public class ExceptionHandler {

    public static String getExceptionDetails(Exception ex){
        return ex.getMessage() +"\n"+ExceptionUtils.getFullStackTrace(ex);
    }
    
}
