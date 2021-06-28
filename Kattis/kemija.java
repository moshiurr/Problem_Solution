import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
      StringBuilder sb = new StringBuilder();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      HashMap<Character,Integer> db = new HashMap<>();
      db.put('a',1);
      db.put('e',1);
      db.put('i',1);
      db.put('o',1);
      db.put('u',1);
      
      while(st.hasMoreTokens()){
          String a = st.nextToken();
          
          for(int i=0;i<a.length();i++){
              char c = a.charAt(i);
              
              if(db.containsKey(c))
                  i+=2;
               sb.append(c);
          }
          sb.append(" ");
      }

      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
}
