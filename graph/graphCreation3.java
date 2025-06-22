package graph;
import java.util.ArrayList;
import java.util.List;

//Graph creation using given matrix in Java

public class graphCreation3 {

    // Edge class to represent an edge in the graph
    static class edge{
        int src; // source vertex
        int dest; // destination vertex
        int wt; // weight of the edge

        edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
        int mat[][] = {
            {0, 1, 5,},
            {1, 2, 7},
            {1, 3, 0},
            {1, 4, 8},
            {2, 3, 1},
            {3, 4, 0}
        };
      List<List<edge>> graph = new ArrayList<>();

        // Initialize the adjacency list for each vertex
        for(int i = 0; i < mat.length; i++) {
            graph.add(new ArrayList<>());
        }

        // Adding edges to the graph from the matrix
        // for(int i = 0; i < mat.length; i++) {
        //     int src = mat[i][0];
        //     int dest = mat[i][1];
        //     int wt = mat[i][2];
        //     graph.get(src).add(new edge(src, dest, wt));
        //     //graph.get(dest).add(new edge(dest, src, wt)); // For undirected graph
        // }
         for(int[] matrix: mat) {
             int u = matrix[0];
            int v = matrix[1];
            int wt = matrix[2];
            graph.get(u).add(new edge(u, v, wt));
            //graph.get(dest).add(new edge(dest, src, wt)); // For undirected graph
        }

        // Print the graph
        for(int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for(edge e : graph.get(i)) {
                System.out.print(" -> " + e.dest + "(wt: " + e.wt + ")");
            }
            System.out.println();
        }

    }
}
