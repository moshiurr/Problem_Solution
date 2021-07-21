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

      String s = br.readLine();

      while(!s.equals("0 0")){
        StringTokenizer st = new StringTokenizer(s);
        int n = getint(st.nextToken());
        int len = getint(st.nextToken());

        String[] db = new String[len];

        for(int i=0;i<n;i++){
          String in = br.readLine();

            for(int j=0;j<len;j++){
              if(i==0) db[j] = in.charAt(j)+"";
              else db[j]+=in.charAt(j);
            }
        }

        Arrays.sort(db, new Comparator<String>(){
          public int compare(String a, String b){
            String a1 = a.toLowerCase();
            String b1 = b.toLowerCase();
            return a1.compareTo(b1);
          }
        });

        String[] ans = new String[n];

        for(int i=0;i<len;i++){
          String in = db[i];
          for(int j=0;j<n;j++){
            if(i==0) ans[j] = in.charAt(j)+"";
            else ans[j]+=in.charAt(j);
          }
        }

        for(int i=0;i<n;i++){
          sb.append(ans[i]+"\n");
        }
        

        sb.append("\n");
        s = br.readLine();
      }


      out.write(sb.toString().getBytes());
      br.close();
      out.close();
  }

  static int getint(String s){
    return Integer.parseInt(s);
  }
}
