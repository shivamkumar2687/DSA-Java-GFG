package graph;
import java.util.ArrayList;
// Graph Creation using Adjacency List in Java
public class graphCreation {

    // Edge class to represent an edge in the graph
    static class Edge {
        int src; // source vertex
        int dest; // destination vertex
        int wt; // weight of the edge

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // Main method to create a graph

    public static void main(String[] args) {
        int v= 5; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];

        // Initialize the adjacency list for each vertex
        for(int i = 0;i<v;i++){
            graph[i] = new ArrayList<>();
        }
        // Adding edges to the graph
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 4, 10));
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 3));


        graph[2].add(new Edge(2, 1, 3));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 4, 2));
        graph[4].add(new Edge(4, 0, 10));
        graph[4].add(new Edge(4, 3, 2));
        // Print the graph
        for(int i=0;i<graph.length;i++){
            System.out.print("Vertex " + i + ": ");
            for(Edge e : graph[i]){
                System.out.print(" -> " + e.dest + "(wt: " + e.wt + ")");
            }
            System.out.println();
        }
        // Example of accessing edges
        System.out.println("Edges from vertex 0:");
        for(Edge e : graph[0]) {
            System.out.println("To vertex " + e.dest + " with weight " + e.wt);
        }
        // Example of accessing edges from vertex 1
        System.out.println("Edges from vertex 1:");
        for(Edge e : graph[1]) {
            System.out.println("To vertex " + e.dest + " with weight " + e.wt);
        }
    }

    }

