package parsers.yaml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import customexceptions.PlutoIOException;
import customexceptions.PlutoYAMLProcessingException;
import exception.ExceptionHandler;
import java.io.IOException;

public class YAMLHandler {
    
    public static String toYAML(Object param) 
            throws PlutoYAMLProcessingException{
        try {
            return new ObjectMapper(new YAMLFactory()).writeValueAsString(param);
        } catch (JsonProcessingException ex) {
            throw new PlutoYAMLProcessingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static Object fromYAML(String yaml) 
            throws PlutoIOException{
        try {
            return new ObjectMapper(new YAMLFactory()).readValue(yaml, Object.class);
        } catch (IOException ex) {
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
}
