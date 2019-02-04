package cachehandler;

import customexceptions.PlutoClassNotFoundException;
import customexceptions.PlutoIOException;
import java.util.HashMap;
import java.util.List;
import serializer.SerializeHandler;

public class CacheHandler {

    private static HashMap<String, Object> cache = new HashMap<>();
    
    public static void insertCacheValue(String identifier,
            Object value){
        cache.put(identifier, value);
    }
    
    public static void insertMultipleValues(List<String> identifiers,
            List<Object> values){
        if(identifiers.size() == values.size()){
            for(int i = 0; i < identifiers.size(); i++){
                cache.put(identifiers.get(i), values.get(i));
            }
        }
    }
    
    public static Object getCacheValue(String identifier){
        return cache.get(identifier);
    }
    
    public static boolean existsCacheValue(String identifier){
        return cache.containsKey(identifier);
    }
    
    public static void deserializeCache(String serial) 
            throws PlutoIOException, PlutoClassNotFoundException{
        cache = (HashMap<String, Object>) SerializeHandler.deserialize(serial);
    }
    
    public static String serializeCache() 
            throws PlutoIOException{
        return SerializeHandler.serialize(cache);
    }
    
}
