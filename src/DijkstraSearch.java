import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
public class DijkstraSearch<V> extends Search<V> {
    private Map<Vertex<V>, Double> distTo;
    public DijkstraSearch(Vertex<V> source) {
        super(source);
        this.edgeTo = new HashMap<>();
        this.distTo = new HashMap<>();
        dijkstra();
    }
    private void dijkstra() {
        PriorityQueue<Vertex<V>> priorityQueue = new PriorityQueue<>(
                Comparator.comparingDouble(this::getDistance)
        );
        distTo.put(source, 0.0);
        edgeTo.put(source, null);
        priorityQueue.add(source);
        while (!priorityQueue.isEmpty()) {
            Vertex<V> current = priorityQueue.poll();
            for (Map.Entry<Vertex<V>, Double> entry : current.getAdjacentVertices().entrySet()) {
                Vertex<V> neighbor = entry.getKey();
                double weight = entry.getValue();
                double newDistance = getDistance(current) + weight;
                if (newDistance < getDistance(neighbor)) {
                    distTo.put(neighbor, newDistance);
                    edgeTo.put(neighbor, current);

                    priorityQueue.remove(neighbor);
                    priorityQueue.add(neighbor);
                }
            }
        }
    }
    private double getDistance(Vertex<V> vertex) {
        return distTo.getOrDefault(vertex, Double.POSITIVE_INFINITY);
    }
    public double distanceTo(Vertex<V> vertex) {
        return getDistance(vertex);
    }
}