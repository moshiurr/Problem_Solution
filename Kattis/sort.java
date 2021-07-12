import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class list {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);

      StringBuilder sb = new StringBuilder();

      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      Map<Integer,obj> db = new HashMap<>();
      Set<obj> ans = new TreeSet<>();
      int index = 0;
      st = new StringTokenizer(br.readLine());
      while(n-->0){
        int input = Integer.parseInt(st.nextToken());
        
        if(db.containsKey(input)){
            obj o = db.get(input);
            o.count++;
            db.put(input,o);
        }
        else{
            obj o = new obj(input,1,index);
            db.put(input,o);
        } 
        index = index + 1;
      }

      Set<Integer> keys = db.keySet();
      for(int key : keys){
          ans.add(db.get(key));
      }

      for(obj o: ans){
        int iter = o.count;
        for(int i=0;i<iter;i++)sb.append(o.value+" ");
      }
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }

    static class obj implements Comparable<obj>{
        int value;
        int count;
        int index;
        obj(int v,int c, int i){
            this.value = v;
            this.count = c;
            this.index = i;
        }

        @Override
        public int compareTo(obj other){
            if(this.count > other.count) return -1;
            else if(this.count < other.count) return 1;
            else if(this.index < other.index) return -1;
            else return 1;
        }
    }

}
