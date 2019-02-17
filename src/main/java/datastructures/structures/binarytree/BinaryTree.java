package datastructures.structures.binarytree;

import datastructures.common.BinaryTreeNode;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryTreeNode<T> rootNode;

    public BinaryTree() {
        rootNode = null;
    }

    public void push(T value) {
        if (rootNode == null) {
            rootNode = new BinaryTreeNode<T>(value);
        } else {
            searchAdd(rootNode, value);
        }

    }

    public void remove(T value) {
        if (contains(value)) {
            searchRemove(rootNode, null, value);
        }
    }

    public BinaryTreeNode<T> searchAdd(BinaryTreeNode<T> current, T value) {

        if (current == null) {
            current = new BinaryTreeNode<>(value);
            return current;
        }
        if (current.getNodeValue().compareTo(value) > 0) {
            current.setLeftNode(searchAdd(current.getLeftNode(), value));

        } else if (current.getNodeValue().compareTo(value) < 0) {
            current.setRightNode(searchAdd(current.getRightNode(), value));
        }
        return current;
    }

    public BinaryTreeNode<T> searchRemove(BinaryTreeNode<T> currentNode, BinaryTreeNode<T> previousNode, T value) {
        if (currentNode.getNodeValue() == value) {
            if (currentNode.onlyHasLeftNode() || currentNode.onlyHasRightNode() || currentNode.hasNoChildNode()) {
                if (previousNode == null) {
                    if (currentNode.getLeftNode() == null) {
                        rootNode = currentNode.getRightNode();
                    } else {
                        rootNode = currentNode.getLeftNode();
                    }
                } else {
                    if (previousNode.getLeftNode() == currentNode) {
                        previousNode.setLeftNode(currentNode.getLeftNode());
                    } else {
                        previousNode.setRightNode(currentNode.getRightNode());
                    }
                }

            } else if (currentNode.hasBothChildNodes()) {
                T minValue = minValue(currentNode.getRightNode());
                searchRemove(currentNode, previousNode, minValue);
                currentNode.setNodeValue(minValue);
                return null;
            }
            return currentNode;
        } else {
            if (currentNode.getNodeValue().compareTo(value) < 0) {
                searchRemove(currentNode.getRightNode(), currentNode, value);
            } else if (currentNode.getNodeValue().compareTo(value) > 0) {
                searchRemove(currentNode.getLeftNode(), currentNode, value);
            }
        }

        return null;
    }

    public T minValue(BinaryTreeNode<T> rootNode) {
        T minimalValue = rootNode.getNodeValue();
        while (rootNode.getLeftNode() != null) {
            minimalValue = rootNode.getLeftNode().getNodeValue();
            rootNode = rootNode.getLeftNode();
        }
        return minimalValue;
    }

    public long size() {
        if (rootNode == null) {
            return 0;
        }
        return sizeCounter(rootNode, 0);
    }

    public long sizeCounter(BinaryTreeNode<T> node, long counter) {
        if (node != null) {
            sizeCounter(node.getLeftNode(), counter + 1);
            sizeCounter(node.getRightNode(), counter + 1);
        }
        return counter;
    }

    public boolean isEmpty() {
        if (rootNode != null) {
            return false;
        }
        return true;
    }

    public boolean contains(T value) {
        if (isEmpty()) {
            return false;
        }
        return containsSearch(rootNode, value);
    }

    public boolean containsSearch(BinaryTreeNode<T> node, T value) {
        if (node.getNodeValue() == value) {
            return true;
        }
        if (node.getLeftNode() != null) {
            if (node.getLeftNode().getNodeValue() == value) {
                return true;
            }
        }
        if (node.getRightNode() != null) {
            if (node.getRightNode().getNodeValue() == value) {
                return true;
            }
        }
        if (node.getNodeValue().compareTo(value) < 0 && node.getRightNode() != null) {
            return containsSearch(node.getRightNode(), value);
        } else if (node.getNodeValue().compareTo(value) > 0 && node.getLeftNode() != null) {
            return containsSearch(node.getLeftNode(), value);
        } else {
            return false;
        }
    }

}
