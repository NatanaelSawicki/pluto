package sorting.common;

import logger.LoggingHandler;

public class ArrayLogger {
    
    public static void log(Object[] array){
        LoggingHandler.log("LOGGING ARRAY", false);
        LoggingHandler.log("ARRAY LENGTH: "+array.length, false);
        LoggingHandler.log("ARRAY CONTENT - BEGIN: ", false);
        for(Object iterador : array){
            LoggingHandler.log((String) iterador, false);
        }
        LoggingHandler.log("ARRAY CONTENT - END: ", false);
        LoggingHandler.skipLine();
    }
    
    public static void log(String[] array){
        LoggingHandler.log("LOGGING ARRAY", false);
        LoggingHandler.log("ARRAY LENGTH: "+array.length, false);
        LoggingHandler.log("ARRAY CONTENT - BEGIN: ", false);
        for(String iterador : array){
            LoggingHandler.log(iterador, false);
        }
        LoggingHandler.log("ARRAY CONTENT - END: ", false);
        LoggingHandler.skipLine();
    }
    
    
    public static void log(Long[] array){
        LoggingHandler.log("LOGGING ARRAY", false);
        LoggingHandler.log("ARRAY LENGTH: "+array.length, false);
        LoggingHandler.log("ARRAY CONTENT - BEGIN: ", false);
        for(Long iterador : array){
            LoggingHandler.log(String.valueOf(iterador), false);
        }
        LoggingHandler.log("ARRAY CONTENT - END: ", false);
        LoggingHandler.skipLine();
    }
    
    public static void log(Double[] array){
        LoggingHandler.log("LOGGING ARRAY", false);
        LoggingHandler.log("ARRAY LENGTH: "+array.length, false);
        LoggingHandler.log("ARRAY CONTENT - BEGIN: ", false);
        for(Double iterador : array){
            LoggingHandler.log(String.valueOf(iterador), false);
        }
        LoggingHandler.log("ARRAY CONTENT - END: ", false);
        LoggingHandler.skipLine();
    }
    
}
