import java.util.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int n = Integer.parseInt(ss.nextLine());
      
      List<Long> db = new ArrayList<>();
      
      for(int i=0; i<n; i++){
          db.add(ss.nextLong());
      }
      
      Collections.sort(db);
      
      long h = 0;
      
      for(int i=0; i<n; i++){
          long t = db.get(i);
          if(t>=n-i){
              h=n-i;
              break;
          } 
      }
      
      ww.write(h+"");
      ss.close();
      ww.close();
    }
}
