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

      int n = getint(br.readLine());

      Stack<Integer> stack = new Stack<Integer>();

      StringTokenizer st = new StringTokenizer(br.readLine());

      int ans = 0;

      for(int i=0; i<2*n;i++){
        int num = getint(st.nextToken());

        if(stack.empty()){
          stack.push(num);
        }else{
          
          int top = stack.pop();
          if(top != num){
            stack.push(top);
            stack.push(num);
          }else ans++;
          
        }
      }

      if(stack.size()>0){
        sb.append("impossible\n");
      } 
      else sb.append(2*ans+"\n");

 
 

      out.write(sb.toString().getBytes());
      br.close();
      out.close();
  }

  static int getint(String s){
    return Integer.parseInt(s);
  }
}
