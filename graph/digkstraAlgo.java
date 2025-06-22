package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class digkstraAlgo {
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
    // Pair class to represent a node and its distance in the priority queue
    static class Pair {
        int node;
        int dist;
        Pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }
    }

    // Dijkstra's algorithm to find the shortest path from source to all vertices
    public static void dijkstra(List<List<edge>> graph, int src) {
        int[] distance = new int[graph.size()];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src] = 0;
        boolean visited[] = new boolean[graph.size()];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> a.dist - b.dist);
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.node]){
                visited[curr.node] = true;

                // Explore all the neighbors of the current node

                for(int i=0; i<graph.get(curr.node).size(); i++){
                    edge e = graph.get(curr.node).get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    
                    if(distance[u] + wt < distance[v]){  // Check if the current path is shorter
                        distance[v]= distance[u] + wt;  // Update the distance if a shorter path is found
                        pq.add(new Pair(v,distance[v])); // Add the updated distance to the priority queue
                    }
                }
            }
        }
          // Print the shortest distances from source vertex 0
        System.out.println("Shortest distances from source vertex 0:");
        for(int i = 0; i < distance.length; i++) {
            System.out.println("Vertex " + i + ": " + distance[i]);
        }

    }
    public static void main(String[] args) {
        int mat[][] = {
            {0, 1, 5,},
            {1, 2, 7},
            {1, 3, 4},
            {1, 4, 8},
            {2, 3, 1},
            {3, 4, 3}
        };
      List<List<edge>> graph = new ArrayList<>();
          
      // Find the maximum node index to determine the size of the graph
       int maxNode = 0;
       for (int[] row : mat) {
           maxNode = Math.max(maxNode, Math.max(row[0], row[1]));
}
        // Initialize the adjacency list for each vertex
        for(int i = 0; i <= maxNode; i++) {
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
        // Run Dijkstra's algorithm from source vertex 0
        dijkstra(graph, 0);
      
        
          

    }
}
