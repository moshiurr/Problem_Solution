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
      
      String line;
      
      while((line = br.readLine()) != null){
          int t = Integer.parseInt(line);
          
          Stack<Integer> s = new Stack<>();
          Queue<Integer> q = new LinkedList<>();
          PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> Integer.compare(y, x));
          
          boolean isStack = true;
          boolean isQ = true;
          boolean isPq = true;
          
          for(int i=0; i<t;i++){
              StringTokenizer st = new StringTokenizer(br.readLine());
              int type = Integer.parseInt(st.nextToken());
              int num = Integer.parseInt(st.nextToken());
              
              if(type == 1){
                  s.push(num);
                  q.add(num);
                  pq.add(num);
              }else{
                  if(s.size() == 0){
                      isStack = false;
                      isQ = false;
                      isPq = false;
                  }else {
                      if(num != s.pop()) isStack = false;
                      if(num != q.remove()) isQ = false;
                      if(num != pq.poll()) isPq = false;
                  }
                  
              }
          }
          
          if((isStack && isQ) || (isStack && isPq) || (isPq && isQ)){
              sb.append("not sure\n");
          }
          else if(isStack) sb.append("stack\n");
          else if(isQ) sb.append("queue\n");
          else if(isPq) sb.append("priority queue\n");
          else sb.append("impossible\n");
      }
      
      
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
}
