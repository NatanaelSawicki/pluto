package object;

import java.util.HashMap;

public class ObjectHandler {

    private static boolean isObjectNull(Object param){
        return param == null;
    }
    
    public static boolean isHashMapNull(HashMap param){
        return isObjectNull(param);
    }
    
    public static boolean isHashMapEmpty(HashMap param){
        return isHashMapNull(param) || param.isEmpty();
    }
    
    public static String validateString(String in, 
            String out, 
            boolean considerEmptyAsNull){
        if(in == null){
            return out;
        }
        if(considerEmptyAsNull && in.isEmpty()){
            return out;
        }
        return in;
    }
    
    public static Long validateLong(Long in,
            Long out){
        return in == null ? out : in;
    }
    
    public static Double validateDouble(Double in,
            Double out){
        return in == null ? out : in;
    }
    
    public static Object validateObject(Object in,
            Object out){
        return in == null ? out : in;
    }
    
}
