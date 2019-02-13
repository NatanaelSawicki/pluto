package datastructures.structures.linkedlist;

import customexceptions.PlutoIOException;
import datastructures.common.LinkedListNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import serializer.SerializeHandler;

public class LinkedList<T> implements Serializable {

    private LinkedListNode<T> firstNode = null;
    private LinkedListNode<T> lastNode = null;

    public LinkedList() {

    }

    public void push(T value) {
        LinkedListNode<T> newValue = new LinkedListNode<>(value);

        if (firstNode == null && lastNode == null) {
            firstNode = newValue;
            lastNode = newValue;
            firstNode.setNextNode(lastNode);
        } else {
            lastNode.setPreviousNode(lastNode);
            lastNode.setNextNode(newValue);
            lastNode = newValue;
        }
    }

    public void remove(T value) {
        LinkedListNode<T> newValue = new LinkedListNode<>(value);
        if (size() != 0 && contains(value)) {
            LinkedListNode<T> nodeIterator = firstNode;
            while (nodeIterator.getNextNode() != null) {
                if (nodeIterator.getNodeData() == value) {
                    if (firstNode == nodeIterator
                            && lastNode == nodeIterator) {
                        firstNode = null;
                        lastNode = null;
                    } else if (firstNode == nodeIterator) {
                        firstNode = nodeIterator.getNextNode();
                    } else if (lastNode == nodeIterator) {
                        lastNode = nodeIterator.getPreviousNode();
                    }
                    break;
                }
            }
        }
    }

    public long size() {
        if (firstNode == null || lastNode == null) {
            return 0;
        }
        long cont = 0;
        LinkedListNode<T> nodeIterator = firstNode;
        do {
            cont++;
        } while ((nodeIterator = nodeIterator.getNextNode()) != null);
        return cont;
    }

    public List<T> getValuesAsList() {
        if (size() == 0) {
            return null;
        }
        List<T> returnVariable = new ArrayList<>();
        LinkedListNode<T> iteratorVariable = firstNode;
        do {
            returnVariable.add(iteratorVariable.getNodeData());
        } while ((iteratorVariable = iteratorVariable.getNextNode()) != null);
        return returnVariable;
    }

    public boolean contains(T value) {
        LinkedListNode<T> iteratorVariable = firstNode;
        do {
            if (iteratorVariable.getNodeData() == value) {
                return true;
            }
        } while ((iteratorVariable = iteratorVariable.getNextNode()) != null);
        return false;
    }

    public String serialize() throws PlutoIOException {
        return SerializeHandler.serialize(this);
    }

}
