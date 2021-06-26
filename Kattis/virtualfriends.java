import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
      StringBuilder sb = new StringBuilder();
      
      int t = Integer.parseInt(br.readLine());
      while(t-->0){
          int n = Integer.parseInt(br.readLine());
          Map<String, Integer> db = new HashMap<>();
          Map<Integer,Integer> mp = new HashMap<>();
          int[] arr = new int[n*2];
          
          for(int i=0;i<2*n;i++)
              arr[i] = i;
          
          for(int i=0; i<n;i++){
              StringTokenizer st = new StringTokenizer(br.readLine());
              String f = st.nextToken();
              String g = st.nextToken();
              int a,b;
              
              if(db.containsKey(f)) a = db.get(f);
              else {
                  a = db.size();
                  db.put(f,db.size());
                  mp.put(a,1);
              }
              
              if(db.containsKey(g)) b = db.get(g);
              else {
                  b = db.size();
                  db.put(g,db.size());
                  mp.put(b,1);
              }
              
              int rootA = root(arr, a);
              int rootB = root(arr, b);
              
              int sum;
              if(rootA != rootB){
                   sum = mp.get(rootA) + mp.get(rootB);
                   mp.put(rootA,sum);
               }else sum = mp.get(rootA);
              
              arr[rootB] = rootA;
              
              sb.append(sum+"\n");
              
              
          }
      }
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
   public static int root(int[] Arr, int i){
        while(Arr[i] != i)
        {
            Arr[i] = Arr[Arr[i]] ; 
            i = Arr[i]; 
        }
        return i;
    }
    
}
