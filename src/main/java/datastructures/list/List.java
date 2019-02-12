package datastructures.list;

import customexceptions.PlutoIOException;
import datastructures.common.ListNode;
import java.io.Serializable;
import serializer.SerializeHandler;

public class List<T> implements Serializable {

    private ListNode<T>[] listValues;
    
    
    
    public String serialize() throws PlutoIOException{
        return SerializeHandler.serialize(this);
    }
    
}
