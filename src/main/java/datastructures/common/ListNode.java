package datastructures.common;

import customexceptions.PlutoIOException;
import java.io.Serializable;
import serializer.SerializeHandler;

public class ListNode<T> implements Serializable {

    private int listPosition;
    private T nodeData;

    public ListNode(int listPosition, T data) {
        this.listPosition = listPosition;
        this.nodeData = data;
    }

    public int getListPosition() {
        return listPosition;
    }

    public void setListPosition(int listPosition) {
        this.listPosition = listPosition;
    }

    public T getNodeData() {
        return nodeData;
    }

    public void setNodeData(T nodeData) {
        this.nodeData = nodeData;
    }
    
    public String serialize() throws PlutoIOException{
        return SerializeHandler.serialize(this);
    }
    
}
