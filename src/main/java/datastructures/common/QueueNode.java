package datastructures.common;

import customexceptions.PlutoIOException;
import java.io.Serializable;
import serializer.SerializeHandler;

public class QueueNode<T> implements Serializable {

    private T objectValue;
    private QueueNode<T> nextNode;

    public QueueNode(T objectData){
        setObjectValue(objectData);
    }
    
    public T getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(T objectValue) {
        this.objectValue = objectValue;
    }

    public QueueNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(QueueNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public String serialize() throws PlutoIOException {
        return SerializeHandler.serialize(this);
    }

}
