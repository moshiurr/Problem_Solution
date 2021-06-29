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
      String jane = "\"Jane Eyre\"";
      
      Map<String,Long> db = new HashMap<>();
      Map<Long, String> newb = new HashMap<>();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      long janePage = Long.parseLong(st.nextToken());
      db.put(jane,janePage);
     
      PriorityQueue<String> pq = new PriorityQueue<String>();
      PriorityQueue<Long> nb = new PriorityQueue<Long>();
      pq.add(jane);
      
      while(n-->0){
          st = new StringTokenizer(br.readLine());
          String b = st.nextToken();
          long page = Long.parseLong(st.nextToken());
          db.put(b,page);
          pq.add(b);
      }
      
      while(m-->0){
          st = new StringTokenizer(br.readLine());
          long min = Long.parseLong(st.nextToken());
          String b = st.nextToken();
          long page = Long.parseLong(st.nextToken());
          db.put(b,page);
          nb.add(min);
      }
      
      long ans = 0;
      while(pq.size() > 0){
          long ttime = nb.peek();
          while(ttime<=ans){
              pq.add(newb.get(nb.poll()));
              ttime = nb.peek();
          }
          
          String book = pq.poll();
          
          ans+=db.get(jane);
          
          if(book.equals(jane)) break;
      }
      
      
      
      sb.append(ans);
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
}
