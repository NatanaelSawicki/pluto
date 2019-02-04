package date;

import enums.PlutoDateFormatEnum;
import customexceptions.PlutoNoSuchDateFormatException;
import java.time.LocalDate;
import string.StringHandler;

public class DateHandler {

    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static String getCurrentDateString() {
        return getCurrentDate().toString();
    }

    private static String applyDateValidation(String date) {
        String param = date;
        param = StringHandler.replaceAll(param, "/", "-");
        param = StringHandler.replaceAll(param, " ", "-");
        param = StringHandler.replaceAll(param, ".", "-");
        param = param.trim();
        return param;
    }

    public static String formatDate(String date, 
            PlutoDateFormatEnum oldFormat, 
            PlutoDateFormatEnum param)
            throws PlutoNoSuchDateFormatException {
        date = applyDateValidation(date);
        String adjustedDate = "";
        switch(oldFormat){
            case MM_dd_yyyy:
                adjustedDate = date.split("-")[1]+"-"+date.split("-")[0]+"-"+date.split("-")[2];
            case yyyy_MM_dd:
                adjustedDate = date.split("-")[2]+"-"+date.split("-")[1]+"-"+date.split("-")[0];
            case dd_MM_yyyy:
                adjustedDate = date.split("-")[0]+"-"+date.split("-")[1]+"-"+date.split("-")[2];
            case yyyy_dd_MM:
                adjustedDate = date.split("-")[1]+"-"+date.split("-")[2]+"-"+date.split("-")[0];
        }
        String[] format = adjustedDate.split("-");
        switch (param) {
            case MM_dd_yyyy:
                return ""+format[1]+"/"+format[0]+"/"+format[2];
            case yyyy_MM_dd:
                return ""+format[2]+"/"+format[1]+"/"+format[0];
            case dd_MM_yyyy:
                return ""+format[0]+"/"+format[1]+"/"+format[2];
            case yyyy_dd_MM:
                return ""+format[2]+"/"+format[0]+"/"+format[1];
            default:
                throw new PlutoNoSuchDateFormatException();
        }
    }

}
