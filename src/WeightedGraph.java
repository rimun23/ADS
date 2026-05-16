import java.util.HashSet;
import java.util.Set;
public class WeightedGraph<V> {
    private Set<Vertex<V>> vertices;
    private boolean directed;
    public WeightedGraph(boolean directed) {
        this.vertices = new HashSet<>();
        this.directed = directed;
    }
    public void addVertex(Vertex<V> vertex) {
        vertices.add(vertex);
    }
    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        source.addAdjacentVertex(destination, weight);
        if (!directed) {
            destination.addAdjacentVertex(source, weight);
        }
        vertices.add(source);
        vertices.add(destination);
    }
    public Set<Vertex<V>> getVertices() {
        return vertices;
    }
}