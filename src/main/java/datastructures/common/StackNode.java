package datastructures.common;

import customexceptions.PlutoIOException;
import serializer.SerializeHandler;

public class StackNode<T> {

    private T objectValue;
    private StackNode<T> previousNode;

    public StackNode(T objectData) {
        setObjectValue(objectData);
    }

    public T getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(T objectValue) {
        this.objectValue = objectValue;
    }

    public StackNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(StackNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public String serialize() throws PlutoIOException {
        return SerializeHandler.serialize(this);
    }

}
