import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
      int num = 2;
      System.out.println(2);
      int x = Integer.parseInt(br.readLine());
      while(x<99){
          
          if(x == 97 || x == 98) {
              System.out.println(99);
              break;
          }else if(x == 95 || x == 94) System.out.println(96);
          else if(x == 92 || x == 91) System.out.println(93);
          else System.out.println(x+1);
          
          x = Integer.parseInt(br.readLine());
      }
      
      br.close();
    }
    
}
