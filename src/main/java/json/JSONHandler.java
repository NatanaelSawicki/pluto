package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import customexceptions.JulyIOException;
import customexceptions.JulyJSONProcessingException;
import exception.ExceptionHandler;
import java.io.IOException;

public class JSONHandler {
    
    public static Object fromJSON(String json) 
            throws JulyIOException{
        try {
            return new ObjectMapper().readValue(json, Object.class);
        } catch (IOException ex) {
            throw new JulyIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static String toJSON(Object param)
            throws JulyJSONProcessingException{
        try {
            return new ObjectMapper().writeValueAsString(param);
        } catch (JsonProcessingException ex) {
            throw new JulyJSONProcessingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
}
