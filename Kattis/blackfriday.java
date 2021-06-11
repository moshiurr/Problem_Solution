import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      Map<Integer, Integer> db = new HashMap<>();
      
      int n = ss.nextInt();
      
      int[] arr = new int[n+1];
      arr[0] = -1;
      
      int ans = 0;;
      
      for(int i=1; i<n+1; i++){
          int in = ss.nextInt();
          arr[i] = in;
          if(db.containsKey(in)) db.put(in,db.get(in)+1);
          else db.put(in,1);
      }
      
      for(int i=1; i<n+1;i++){
          if(db.get(arr[i]) > 1) continue;
          else{
              if(arr[ans] < arr[i]) ans = i;
          }
      }
      
      if(ans != 0) ww.write(ans+"");
      else ww.write("none");
      
      ss.close();
      ww.close();
    }
}
