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
      
      int n = Integer.parseInt(br.readLine());
      Pair[] db = new Pair[n];
      
      for(int i=0; i<n;i++){
          StringTokenizer st = new StringTokenizer(br.readLine());
          int s = Integer.parseInt(st.nextToken());
          int e = Integer.parseInt(st.nextToken());
          Pair p = new Pair(s,e);
          db[i]=p;
      }

      Arrays.sort(db, new Comparator<Pair>() {
      @Override
      public int compare(Pair p1, Pair p2) {
        if(p1.end>p2.end) return 1;
        else if(p1.end<p2.end) return -1;
        else{
          return 0;
        }
       }
       });

      long ans = 1;
      int end = db[0].end;
      
      for(int i=1;i<n;i++){
          Pair p = db[i];
          if(p.start>end){
              ans++;
              end = p.end;
          }
      }
      sb.append(ans+"\n");
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    static class Pair{
        int start;
        int end;
        Pair(int s, int e){
            start = s;
            end = e;
        }
    }
    
}
