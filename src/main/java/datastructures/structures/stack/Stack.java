package datastructures.structures.stack;

import datastructures.common.StackNode;
import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private StackNode<T> lastNode;

    public Stack() {
        lastNode = null;
    }

    public boolean push(T objectParamter) {
        if (objectParamter == null) {
            return false;
        }
        StackNode<T> newNode = new StackNode<>(objectParamter);
        if (lastNode == null) {
            lastNode = newNode;
            return true;
        }
        newNode.setPreviousNode(lastNode);
        lastNode = newNode;
        return true;
    }

    public boolean remove() {
        if (isEmpty()) {
            return false;
        }
        if (lastNode.getPreviousNode() == null) {
            lastNode = null;
            return true;
        }
        lastNode = lastNode.getPreviousNode();
        return true;
    }

    public boolean contains(T objectParameter) {
        if (isEmpty()) {
            return false;
        }
        StackNode<T> iteratorNode = lastNode;
        do {
            if (iteratorNode.getObjectValue() == objectParameter) {
                return true;
            }
        } while ((iteratorNode = iteratorNode.getPreviousNode()) != null);
        return false;
    }

    public long size() {
        if (lastNode == null) {
            return 0;
        }
        long nodeCounter = 0;
        StackNode<T> iteratorNode = lastNode;
        do {
            nodeCounter++;
        } while ((iteratorNode = iteratorNode.getPreviousNode()) != null);
        return nodeCounter;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public List<T> getAsList() {
        if (isEmpty()) {
            return null;
        }
        List<T> returnList = new ArrayList<>();
        StackNode<T> iteratorNode = lastNode;
        do {
            returnList.add(iteratorNode.getObjectValue());
        } while ((iteratorNode = iteratorNode.getPreviousNode()) != null);
        return returnList;
    }

}
