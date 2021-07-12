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

      int n = Integer.parseInt(st.nextToken());

      BigInteger prevAns = BigInteger.ONE;

      while(n-->0){
          st = new StringTokenizer(br.readLine());
          BigInteger a = new BigInteger(st.nextToken());
          char op = st.nextToken().charAt(0);
          BigInteger b = new BigInteger(st.nextToken());


          if(op == '+'){
              a = a.add(b);
              prevAns = a.subtract(prevAns);
          }else if(op == '-'){
              a = a.subtract(b);

              prevAns = a.multiply(prevAns);
          }else if( op == '*'){
              a = a.multiply(b);
              prevAns = a.multiply(a);
          }
          else {
              if (a.mod(BigInteger.TWO) == BigInteger.ZERO) prevAns = a.divide(BigInteger.TWO);
              else prevAns = a.add(BigInteger.ONE).divide(BigInteger.TWO);
          }

          sb.append(prevAns+"\n");
      }
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }

}
