import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int n = ss.nextInt();
      int m = ss.nextInt();
      
      int[] db = new int[n];
      
      for(int i=0;i<n;i++){
          db[i] = ss.nextInt();
      }
      
      Arrays.sort(db);
      
      int[] in = new int[m];
      for(int i=0;i<m;i++){
          in[i] = ss.nextInt();
      }
      
      Arrays.sort(in);
      
      
      long ans = 0;
      int cur = 0;
      
      for(int i=0;i<m;i++){
          int t = in[i];
          while(db[cur]<t) cur++;
          ans+=(db[cur]-t);
      }
      
      ww.write(ans+"\n");
      
      ss.close();
      ww.close();
    }
}
