package datastructures.common;

public class BinaryTreeNode<T> {

    private T nodeValue;
    private BinaryTreeNode<T> leftNode;
    private BinaryTreeNode<T> rightNode;

    public BinaryTreeNode(T parameterValue) {
        setNodeValue(parameterValue);
    }

    public T getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(T nodeValue) {
        this.nodeValue = nodeValue;
    }

    public BinaryTreeNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public boolean onlyHasRightNode() {
        return getRightNode() != null && getLeftNode() == null;
    }

    public boolean onlyHasLeftNode() {
        return getLeftNode() != null && getRightNode() == null;
    }

    public boolean hasNoChildNode() {
        return getLeftNode() == null && getRightNode() == null;
    }

    public boolean hasBothChildNodes() {
        return !hasNoChildNode();
    }

}
