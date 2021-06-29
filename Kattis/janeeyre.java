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
      String jane = "Jane Eyre";
      
      Map<String,Long> db = new HashMap<>();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());
      
      long janePage = Long.parseLong(st.nextToken());
      db.put(jane,janePage);
     
      PriorityQueue<String> pq = new PriorityQueue<String>();
      PriorityQueue<NewBook> nb = new PriorityQueue<NewBook>();
      pq.add(jane);
      
      while(n-->0){
          st = new StringTokenizer(br.readLine(),"\"");
          String b = st.nextToken();
          long page = Long.parseLong(st.nextToken().trim());
          db.put(b,page);
          pq.add(b);
      }
      int i=0;
      while(i++<m){
          st = new StringTokenizer(br.readLine(),"\"");
          long min = Long.parseLong(st.nextToken().trim());
          String b = st.nextToken();
          long page = Long.parseLong(st.nextToken().trim());
          db.put(b,page);
          nb.add(new NewBook(b,min));
      }
      
      long ans = 0;
      long time = 1;
      
      while(pq.size() > 0){
          
          if(nb.size() > 0) time = nb.peek().arrivalTime;
          else time = ans + 1;
          
          while(time<=ans){
              NewBook tBook = nb.poll();
              pq.add(tBook.name);
              if(nb.size() == 0) break;
              time = nb.peek().arrivalTime;
          }
          
          String book = pq.poll();
          
          ans+=db.get(book);
          
          if(book.equals(jane)) break;
      }
      
      sb.append(ans);
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    public static class NewBook implements Comparable<NewBook>{
        String name;
        long arrivalTime;
        NewBook(String s, long t){
            name=s;
            arrivalTime = t;
        }
        @Override
        public int compareTo(NewBook nb) {
            if(this.arrivalTime <= nb.arrivalTime) return -1;
            else return 1;
        }

    }
    
}
