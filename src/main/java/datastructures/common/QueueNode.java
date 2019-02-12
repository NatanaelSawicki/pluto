package datastructures.common;

import customexceptions.PlutoIOException;
import java.io.Serializable;
import serializer.SerializeHandler;

public class QueueNode<T> implements Serializable {

    
    private T data;
    
    
    
    public String serialize() throws PlutoIOException{
        return SerializeHandler.serialize(this);
    }
    
}
