package serializer;

import customexceptions.PlutoClassNotFoundException;
import customexceptions.PlutoIOException;
import exception.ExceptionHandler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class SerializeHandler {
    
    public static String serialize(Object param) 
            throws PlutoIOException{
        try {
            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
            ObjectOutputStream objOutput = new ObjectOutputStream(byteOutput);
            objOutput.writeObject(param);
            objOutput.flush();
            objOutput.close();
            byteOutput.close();
            return new String(Base64.getEncoder().encode(byteOutput.toByteArray()));
        } catch (IOException ex) {
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static Object deserialize(String param) 
            throws PlutoIOException, PlutoClassNotFoundException{
        try{
            byte[] bArr = Base64.getDecoder().decode(param.getBytes());
            ByteArrayInputStream byteInput = new ByteArrayInputStream(bArr);
            ObjectInputStream objInput = new ObjectInputStream(byteInput);
            Object obj = objInput.readObject();
            byteInput.close();
            objInput.close();
            return obj;
        }catch(IOException ex){
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        } catch (ClassNotFoundException ex) {
            throw new PlutoClassNotFoundException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
}
