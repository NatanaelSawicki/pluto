package datastructures.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Node<T> implements Serializable {

    private List<Node<T>> adjacents;

    public Node() {
        adjacents = new ArrayList<>();
    }

    public boolean push(Node<T> t) {
        adjacents.add(t);
        return true;
    }

    public boolean remove(Node<T> t) {
        for (Node it : adjacents) {
            if (t == it) {
                adjacents.remove(it);
                return true;
            }
        }
        return false;
    }

    public int getAdjacentsSize() {
        return adjacents.size();
    }
    
    public boolean contains(Node<T> t){
        return adjacents.stream().anyMatch((it) -> (t == it));
    }

    public boolean isEmpty() {
        return adjacents.isEmpty();
    }

    public List<Node<T>> getAdjacents() {
        return adjacents;
    }

    public void setAdjacents(List<Node<T>> adjacents) {
        this.adjacents = adjacents;
    }

}
