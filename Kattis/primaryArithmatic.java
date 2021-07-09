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

      String in = br.readLine();
      while(!in.equals("0 0")){
          StringTokenizer st = new StringTokenizer(in);
          String num1 = reverseIt(st.nextToken());
          String num2 = reverseIt(st.nextToken());

          int total = 0;
          int prevCarry = 0;
          int i=0;
          for(i=0;i<num1.length() && i<num2.length();i++){
            int a = getValue(num1.charAt(i));
            int b = getValue(num2.charAt(i));
            if(a+b+prevCarry > 9){
                total+=1;
                prevCarry = 1;
            }else prevCarry = 0;
          }
            if(prevCarry == 1 && num1.length()>num2.length()){
                while(i<num1.length()){
                    int a = getValue(num1.charAt(i));
                    if(a+prevCarry>9){
                        total++;
                        prevCarry = 1;
                    }else prevCarry = 0;
                    i++;
                }
            }
            if(prevCarry == 1 && num1.length()<num2.length()){
                while(i<num2.length()){
                    int a = getValue(num2.charAt(i));
                    if(a+prevCarry>9){
                        total++;
                        prevCarry = 1;
                    }else prevCarry = 0;
                    i++;
                }
            }
          
          if(total == 0) sb.append("No carry operation.\n");
          else if(total == 1) sb.append(total+" carry operation.\n");
          else sb.append(total+" carry operations.\n");
          in = br.readLine();
      }
    
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    public static int getValue(char a){
        return a - '0';
    }

    public static String reverseIt(String s){
        String n="";
        int len = s.length();
        for(int i=len-1; i>=0; i--){
            n+=s.charAt(i);
        }
        return n;
    }

}
