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
      
      String in = br.readLine();
      
      Set<Character> db = new HashSet<>();
      
      for(int i=0;i<in.length();i++){
          db.add(in.charAt(i));
      }
      
      int count = 10;
      
      String p = br.readLine();
      
      for(int i=0;i<p.length();i++){
          char c = p.charAt(i);
          
          if(count == 0 || db.size() == 0) break;
          
          if(db.contains(c)){
              db.remove(c);
          }else count--;
      }
      
      if(db.size() == 0) sb.append("WIN\n");
      else sb.append("LOSE\n");

      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
}
