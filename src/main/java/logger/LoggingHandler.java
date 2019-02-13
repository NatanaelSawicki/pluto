package logger;

import date.DateHandler;
import java.util.ArrayList;

public class LoggingHandler {
    
    private static ArrayList<String> logginCache = new ArrayList<>();

    public static ArrayList<String> getLogginCache() {
        return logginCache;
    }

    public static void setLogginCache(ArrayList<String> logginCache) {
        LoggingHandler.logginCache = logginCache;
    }

    public static void log(String logMessage, boolean isError) {
        String sLog;

        if (logMessage.isEmpty()) {
            sLog = "[LOG_ERROR] [" + DateHandler.getCurrentDateString() + "] Tried to log an empty message.";
        } else {
            if (isError) {
                sLog = "[ERROR] " + logMessage;
            } else {
                sLog = "[LOG] " + logMessage;
            }
        }

        if (sLog != null) {
            logginCache.add(sLog);
            System.out.println(sLog);
        }

    }

}
