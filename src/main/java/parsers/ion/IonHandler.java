package parsers.ion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.ion.IonObjectMapper;
import customexceptions.PlutoIOException;
import customexceptions.PlutoIonProcessingException;
import exception.ExceptionHandler;
import java.io.IOException;

public class IonHandler {

    public static byte[] toIon(Object param) 
            throws PlutoIonProcessingException{
        try {
            return new IonObjectMapper().writeValueAsBytes(param);
        } catch (JsonProcessingException ex) {
            throw new PlutoIonProcessingException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static Object fromIon(byte[] ion) 
            throws PlutoIOException{
        try {
            return new IonObjectMapper().readValue(ion, Object.class);
        } catch (IOException ex) {
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
}
