import java.util.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int n = ss.nextInt();
      
      int db[] = new int[n];
      
      for(int i=0; i<n; i++){
          db[i] = ss.nextInt();
      }
      
      Arrays.sort(db);
      
      int prev = db[0];
      int streak = 0;
      
      ww.write(prev+"");
      
      for(int i=1; i<n;i++){
          if(prev != db[i]-1){
              
              if(streak > 1){
                   ww.write("-"+prev+" "+db[i]);
              }else if(streak == 1) ww.write(" "+prev+" "+db[i]);
              else ww.write(" "+db[i]); 
              
              streak = 0;
          }
          else {
              streak++;
          }
          prev = db[i];
      }
      
      if(streak>1) ww.write("-"+prev);
      else if(streak == 1){
          ww.write(" "+prev);
      }
      
      ss.close();
      ww.close();
    }
}
