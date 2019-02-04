package yaml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import customexceptions.JulyIOException;
import customexceptions.JulyJSONProcessingException;
import exception.ExceptionHandler;
import java.io.IOException;

public class YAMLHandler {
    
    public static String toYAML(Object param) 
            throws JulyJSONProcessingException{
        try {
            return new ObjectMapper(new YAMLFactory()).writeValueAsString(param);
        } catch (JsonProcessingException ex) {
            throw new JulyJSONProcessingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static Object fromYAML(String yaml) 
            throws JulyIOException{
        try {
            return new ObjectMapper(new YAMLFactory()).readValue(yaml, Object.class);
        } catch (IOException ex) {
            throw new JulyIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
}
