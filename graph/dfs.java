package graph;
import java.util.ArrayList;


public class dfs {

static class Edge{
    int src;
    int dest;
    int wt;
    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

public static void dfs (ArrayList<ArrayList<Edge>> graph, int curr, boolean[] visited) {
   System.out.println("curr = "+curr);
   visited[curr] = true;
   for(int i=0;i<graph.get(curr).size();i++){
         Edge e = graph.get(curr).get(i);
         if(!visited[e.dest]){
            dfs(graph, e.dest, visited);
   }
}

}
public static void main(String[] args) {
    ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    int matrix[][] = {
        {0, 1, 5},
          {0, 2, 8},
        {1, 3, 0},
        {2, 4, 1},
        {3,4,9},
        {3, 5, 0},
        {4, 5, 8},
        {5, 6, 1},
       
    };
    for(int i=0;i<matrix.length;i++){
        graph.add(new ArrayList<>());
    }
    for(int[] mat : matrix){
        int u = mat[0];
        int v = mat[1];
        int wt = mat[2];
       graph.get(u).add(new Edge(u, v, wt));
        // graph.get(v).add(new Edge(v, u, wt)); // Uncomment for undirected graph
    }
    // Print the graph
   for(int i = 0;i<graph.size();i++){
        System.out.print("Vertex " + i + ": ");
        for(Edge e : graph.get(i)){
            System.out.print(" -> " + e.dest + "(wt: " + e.wt + ")");
        }
        System.out.println();
    }
    boolean visited[] = new boolean[graph.size()];
  
    dfs(graph, 0, visited);
      
}
}
    

