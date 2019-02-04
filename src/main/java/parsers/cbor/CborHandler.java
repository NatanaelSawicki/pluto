package parsers.cbor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import customexceptions.PlutoCBORProcessingException;
import customexceptions.PlutoIOException;
import exception.ExceptionHandler;
import java.io.IOException;

public class CborHandler {

    public static String toCBOR(Object param) 
            throws PlutoCBORProcessingException{
        try {
            return new ObjectMapper(new CBORFactory()).writeValueAsString(param);
        } catch (JsonProcessingException ex) {
            throw new PlutoCBORProcessingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static Object fromCBOR(String value) 
            throws PlutoIOException{
        try{
            return new ObjectMapper(new CBORFactory()).readValue(value, Object.class);
        }catch(IOException ex){
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
}
