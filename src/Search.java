import java.util.LinkedList;
import java.util.List;
import java.util.Map;
public abstract class Search<V> {
    protected Vertex<V> source;
    protected Map<Vertex<V>, Vertex<V>> edgeTo;
    public Search(Vertex<V> source) {
        this.source = source;
    }
    public boolean hasPathTo(Vertex<V> vertex) {
        return edgeTo.containsKey(vertex);
    }
    public List<Vertex<V>> pathTo(Vertex<V> vertex) {
        if (!hasPathTo(vertex)) {
            return null;
        }
        LinkedList<Vertex<V>> path = new LinkedList<>();
        for (Vertex<V> current = vertex; current != null; current = edgeTo.get(current)) {
            path.addFirst(current);
        }
        return path;
    }
}