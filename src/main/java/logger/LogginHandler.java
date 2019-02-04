package logger;

public class LogginHandler {
    
    public static void log(String logMessage, boolean isError){
        if(isError){
            System.err.print(logMessage);
        }else{
            System.out.println(logMessage);
        }
    }
    
}
