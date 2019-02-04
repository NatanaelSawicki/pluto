package parsers.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import customexceptions.PlutoIOException;
import customexceptions.PlutoJSONProcessingException;
import exception.ExceptionHandler;
import java.io.IOException;

public class JSONHandler {
    
    public static Object fromJSON(String json) 
            throws PlutoIOException{
        try {
            return new ObjectMapper().readValue(json, Object.class);
        } catch (IOException ex) {
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static String toJSON(Object param)
            throws PlutoJSONProcessingException{
        try {
            return new ObjectMapper().writeValueAsString(param);
        } catch (JsonProcessingException ex) {
            throw new PlutoJSONProcessingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
}
