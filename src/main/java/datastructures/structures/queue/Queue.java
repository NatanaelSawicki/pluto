package datastructures.structures.queue;

import datastructures.common.QueueNode;
import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private QueueNode<T> firstPosition;
    private QueueNode<T> lastPosition;

    public Queue() {
        firstPosition = null;
        lastPosition = null;
    }

    public boolean push(T newObjectParameter) {
        if (newObjectParameter == null) {
            return false;
        }

        QueueNode<T> newNode = new QueueNode<>(newObjectParameter);

        if (firstPosition == null
                || lastPosition == null) {
            firstPosition = newNode;
            lastPosition = newNode;
            firstPosition.setNextNode(lastPosition);
            return true;
        }
        lastPosition.setNextNode(newNode);
        lastPosition = newNode;
        return true;
    }

    public boolean remove() {
        if (isEmpty()) {
            return false;
        }

        if (firstPosition.getNextNode() == null
                || firstPosition == lastPosition) {
            firstPosition = null;
            lastPosition = null;
            return true;
        }
        firstPosition = firstPosition.getNextNode();
        return true;
    }

    public long size() {
        if (firstPosition == null || lastPosition == null) {
            return 0;
        }
        QueueNode<T> iteratorNode = firstPosition;
        long sizeCounter = 0;
        do {
            sizeCounter++;
        } while ((iteratorNode = iteratorNode.getNextNode()) != null);
        return sizeCounter;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(T objectParameter) {
        if (isEmpty()) {
            return false;
        }
        QueueNode<T> iteratorNode = firstPosition;
        do {
            if (iteratorNode.getObjectValue() == objectParameter) {
                return true;
            }
        } while ((iteratorNode = iteratorNode.getNextNode()) != null);
        return false;
    }

    public List<T> getAsList() {
        if (isEmpty()) {
            return null;
        }
        List<T> returnList = new ArrayList<>();
        QueueNode<T> iteratorNode = firstPosition;
        do {
            returnList.add(iteratorNode.getObjectValue());
        } while ((iteratorNode = iteratorNode.getNextNode()) != null);
        return returnList;
    }

}
