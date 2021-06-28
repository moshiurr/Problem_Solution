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
      
      int n = Integer.parseInt(br.readLine());
     
      for(int i=0;i<n;i++){
          Set<Character> db = new TreeSet<>();
          
          db.add('a');
          db.add('b');
          db.add('c');
          db.add('d');
          db.add('e');
          db.add('f');
          db.add('g');
          db.add('h');
          db.add('i');
          db.add('j');
          db.add('k');
          db.add('l');
          db.add('m');
          db.add('n');
          db.add('o');
          db.add('p');
          db.add('q');
          db.add('r');
          db.add('s');
          db.add('t');
          db.add('u');
          db.add('v');
          db.add('w');
          db.add('x');
          db.add('y');
          db.add('z');
          
          StringTokenizer st = new StringTokenizer(br.readLine().toLowerCase());
          
          while(st.hasMoreTokens()){
              String s = st.nextToken();
              for(int j=0;j<s.length();j++){
                  char c = s.charAt(j);
                  if(db.contains(c)) db.remove(c);
              }
          }
          
          if(db.size() == 0) sb.append("pangram");
          else{
              sb.append("missing ");
              for(char c : db) sb.append(c);
          }
          sb.append("\n");
      }

      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
}
