import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
public class BreadthFirstSearch<V> extends Search<V> {
    public BreadthFirstSearch(Vertex<V> source) {
        super(source);
        this.edgeTo = new HashMap<>();
        bfs();
    }
    private void bfs() {
        Queue<Vertex<V>> queue = new LinkedList<>();
        edgeTo.put(source, null);
        queue.add(source);
        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            for (Vertex<V> neighbor : current.getAdjacentVertices().keySet()) {
                if (!edgeTo.containsKey(neighbor)) {
                    edgeTo.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }
    }
}