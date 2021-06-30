import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
      StringBuilder sb = new StringBuilder();
      
      int t = Integer.parseInt(br.readLine());
      
      while(t-->0){
          int n = Integer.parseInt(br.readLine());
          String[] db = new String[n];
          
          for(int i=0;i<n;i++){
              db[i] = br.readLine();
          }
          
          Arrays.sort(db);
          
          boolean con = true;
          for(int i=0; i<n-1;i++){
        
              if(same(db[i], db[i+1])){
                  con = false;
                  break;
              }
          }
          
          if(con) sb.append("YES\n");
          else sb.append("NO\n");
      }
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    static boolean same(String s, String d){
        int n = s.length();
        for(int i=0; i<n;i++){
            if(s.charAt(i) != d.charAt(i)) return false;
        }
        return true;
    }
}
