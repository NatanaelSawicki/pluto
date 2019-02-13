package datastructures.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> implements Serializable {

    private List<GraphNode<T>> adjacents;

    public GraphNode() {
        adjacents = new ArrayList<>();
    }

    public boolean push(GraphNode<T> t) {
        adjacents.add(t);
        return true;
    }

    public boolean remove(GraphNode<T> t) {
        for (GraphNode it : adjacents) {
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
    
    public boolean contains(GraphNode<T> t){
        return adjacents.stream().anyMatch((it) -> (t == it));
    }

    public boolean isEmpty() {
        return adjacents.isEmpty();
    }

    public List<GraphNode<T>> getAdjacents() {
        return adjacents;
    }

    public void setAdjacents(List<GraphNode<T>> adjacents) {
        this.adjacents = adjacents;
    }

}
