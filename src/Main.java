public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>(false);
        Vertex<String> astana = new Vertex<>("Astana");
        Vertex<String> almaty = new Vertex<>("Almaty");
        Vertex<String> shymkent = new Vertex<>("Shymkent");
        Vertex<String> karaganda = new Vertex<>("Karaganda");
        Vertex<String> aktobe = new Vertex<>("Aktobe");
        graph.addEdge(astana, karaganda, 3.0);
        graph.addEdge(astana, almaty, 10.0);
        graph.addEdge(karaganda, almaty, 4.0);
        graph.addEdge(almaty, shymkent, 2.0);
        graph.addEdge(shymkent, aktobe, 8.0);
        graph.addEdge(karaganda, aktobe, 15.0);
        System.out.println("BFS path from Astana to Aktobe:");
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(astana);
        System.out.println(bfs.pathTo(aktobe));
        System.out.println();
        System.out.println("Dijkstra path from Astana to Aktobe:");
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>(astana);
        System.out.println(dijkstra.pathTo(aktobe));
        System.out.println("Distance: " + dijkstra.distanceTo(aktobe));
    }
}