import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class list {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);

      StringBuilder sb = new StringBuilder();

      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = getint(st.nextToken());
      int db[][] = new int[n][n];
      //int count = 0;
      for(int i=0;i<n;i++){
        st = new StringTokenizer(br.readLine());
        for(int j=0;j<n;j++){
          db[i][j] = getint(st.nextToken());
          
        }
      }
      int parent[] = primMST(db, n);

      for(int i=1;i<n;i++){
        sb.append((parent[i]+1)+" "+(i+1)+"\n");
      }
      out.write(sb.toString().getBytes());
      br.close();
      out.close();
  }

  static int getint(String s){
    return Integer.parseInt(s);
  }

  static int[] primMST(int graph[][], int V)
  {
      // Array to store constructed MST
      int parent[] = new int[V];

      // Key values used to pick minimum weight edge in cut
      int key[] = new int[V];

      // To represent set of vertices included in MST
      Boolean mstSet[] = new Boolean[V];

      // Initialize all keys as INFINITE
      for (int i = 0; i < V; i++) {
          key[i] = Integer.MAX_VALUE;
          mstSet[i] = false;
      }

      // Always include first 1st vertex in MST.
      key[0] = 0; // Make key 0 so that this vertex is
      // picked as first vertex
      parent[0] = -1; // First node is always root of MST

      // The MST will have V vertices
      for (int count = 0; count < V - 1; count++) {
          // Pick thd minimum key vertex from the set of vertices
          // not yet included in MST
          int u = minKey(key, mstSet,V);

          // Add the picked vertex to the MST Set
          mstSet[u] = true;

          // Update key value and parent index of the adjacent
          // vertices of the picked vertex. Consider only those
          // vertices which are not yet included in MST
          for (int v = 0; v < V; v++)

              // graph[u][v] is non zero only for adjacent vertices of m
              // mstSet[v] is false for vertices not yet included in MST
              // Update the key only if graph[u][v] is smaller than key[v]
              if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                  parent[v] = u;
                  key[v] = graph[u][v];
              }
      }
      return parent;
  }

  static int minKey(int key[], Boolean mstSet[], int V)
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;
  
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
  
        return min_index;
    }
}
