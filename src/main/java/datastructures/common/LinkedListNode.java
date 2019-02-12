package datastructures.common;

import customexceptions.PlutoIOException;
import java.io.Serializable;
import serializer.SerializeHandler;

public class LinkedListNode<T> implements Serializable {

    private LinkedListNode<T> previousNode;
    private LinkedListNode<T> nextNode;
    private T nodeData;

    public LinkedListNode(T data) {
        this.nodeData = data;
    }
    
    public T getNodeData() {
        return nodeData;
    }

    public void setNodeData(T nodeData) {
        this.nodeData = nodeData;
    }

    public LinkedListNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(LinkedListNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public LinkedListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode<T> nextNode) {
        this.nextNode = nextNode;
    }
    
    public String serialize() throws PlutoIOException{
        return SerializeHandler.serialize(this);
    }

}
