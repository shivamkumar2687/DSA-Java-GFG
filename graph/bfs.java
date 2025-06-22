package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs {
     static class Edge{
        int src; // source vertex
        int dest; // destination vertex
        int wt; // weight of the edge

        Edge(int s, int d, int w) {
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
      List<List<Edge>> graph = new ArrayList<>();

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
            graph.get(u).add(new Edge(u, v, wt));
            //graph.get(dest).add(new edge(dest, src, wt)); // For undirected graph
        }

        // Print the graph
        for(int i = 0; i < graph.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for(Edge e : graph.get(i)) {
                System.out.print(" -> " + e.dest + "(wt: " + e.wt + ")");
            }
            System.out.println();
        }
        // Call BFS algorithm
        System.out.println("BFS Traversal:");
        bfs(graph);

    }
    // BFS algorithm implementation
    public static void bfs(List<List<Edge>> graph){
        Queue<Integer>q = new LinkedList<>();
        boolean[] isVisted = new boolean[graph.size()];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!isVisted[curr]){{
                isVisted[curr] = true;
                System.out.print(curr + " ");
                for(int i =0;i<graph.get(curr).size();i++){
                    Edge e = graph.get(curr).get(i);
                   q.add(e.dest);
                  // System.out.println("Destination "+e.dest);
                    }
                }
            }
        
        }
        
    }
}
