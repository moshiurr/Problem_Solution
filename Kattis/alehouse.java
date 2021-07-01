import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
      StringBuilder sb = new StringBuilder();

      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      int n = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      
      Event[] db = new Event[n*2];
      
      for(int i=0; i<n;i++){
          st = new StringTokenizer(br.readLine());
          db[i] = new Event(Integer.parseInt(st.nextToken()), true);
          db[i+n] = new Event(Integer.parseInt(st.nextToken())+k, false);
      }
      
      Arrays.sort(db);
      
      int max = 0;
      int count = 0;
      
      for(int i=0; i<n*2; i++){
 
          Event e = db[i];
          
          if(e.arrival){
              count++;
          }else count--;
         
          max = Math.max(max,count);
      }
      
      sb.append(max);
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    public static class Event implements Comparable<Event>{
        int time;
        boolean arrival;
        
        Event(int t, boolean b){
            time = t;
            arrival = b;
        }
        
        @Override
        public int compareTo(Event e){
            if(this.time < e.time) return -1;
            else if(this.time > e.time) return 1;
            else{
                 if(this.arrival) return -1;
                 else return 1;
            }
            
        }
    }
    
}
