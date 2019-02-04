package parsers.smile;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import customexceptions.PlutoIOException;
import customexceptions.PlutoSmileProcessingException;
import exception.ExceptionHandler;
import java.io.IOException;


public class SmileHandler {

    public static String toSmile(Object param) 
            throws PlutoSmileProcessingException{
        try {
            return new ObjectMapper(new SmileFactory()).writeValueAsString(param);
        } catch (JsonProcessingException ex) {
            throw new PlutoSmileProcessingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static Object fromSmile(String smile)
            throws PlutoIOException{
        try{
            return new ObjectMapper(new SmileFactory()).readValue(smile, Object.class);
        }catch(IOException ex){
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
}
