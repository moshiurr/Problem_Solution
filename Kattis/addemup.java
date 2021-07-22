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
      long sum = Long.parseLong(st.nextToken());

      st = new StringTokenizer(br.readLine());
      List<Long> db = new ArrayList<>();
      Set<Long> set = new HashSet<>();

      for(int i=0;i<n;i++){
        long num = Long.parseLong(st.nextToken());
        db.add(num);
      }

      boolean done = false;

      for(int i=0;i<db.size();i++){
        long num = db.get(i);
        long inverse = sum - num;

        if(set.contains(inverse)){
          done = true;
          break;
        }

        long u = upsideDown(num);

        if(u!= -1 && u != num){
          if(set.contains(sum-u)){
            done = true;
            break;
          }
          set.add(u);
        }

        set.add(num);
      }

      if(done) sb.append("YES");
      else sb.append("NO");

      out.write(sb.toString().getBytes());
      br.close();
      out.close();
  }

  static int getint(String s){
    return Integer.parseInt(s);
  }

  static long upsideDown(long num){

    String s = Long.toString(num);
    String up = "";

    for(int i=0;i<s.length();i++){
      char c = s.charAt(i);
      if(isUpsidable(c)){
        if(c == '6') up = '9'+up;
        else if(c=='9') up = '6'+up;
        else up = c+up;
      } else return -1;
      
    }

    return Long.parseLong(up);
  }

  static boolean isUpsidable(char c){
     return (c == '0' || c=='1'||c=='2'||c=='5'||c=='6'||c=='8'||c=='9');
  }
}
