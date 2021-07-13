import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class list {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);

      StringBuilder sb = new StringBuilder();

      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = getint(st.nextToken());
      long x = Long.parseLong(st.nextToken());

      long db[] = new long[n];

      st = new StringTokenizer(br.readLine());
      for(int i=0;i<n;i++){
        db[i] = Long.parseLong(st.nextToken());
      }

      Arrays.sort(db);
      long ans = 1;

      long prev = db[0];
      for(int i=1;i<n;i++){
        if(prev+db[i]>x) break;
        prev = db[i];
        ans++;
      }
      sb.append(ans);

      out.write(sb.toString().getBytes());
      br.close();
      out.close();
  }

  static int getint(String s){
    return Integer.parseInt(s);
  }
}
