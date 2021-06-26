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
      
      Map<Character, String> db = new HashMap<>();
      
      db.put('a',"2");
      db.put('b',"22");
      db.put('c',"222");
      db.put('d',"3");
      db.put('e',"33");
      db.put('f',"333");
      db.put('g',"4");
      db.put('h',"44");
      db.put('i',"444");
      db.put('j',"5");
      db.put('k',"55");
      db.put('l',"555");
      db.put('m',"6");
      db.put('n',"66");
      db.put('o',"666");
      db.put('p',"7");
      db.put('q',"77");
      db.put('r',"777");
      db.put('s',"7777");
      db.put('t',"8");
      db.put('u',"88");
      db.put('v',"888");
      db.put('w',"9");
      db.put('x',"99");
      db.put('y',"999");
      db.put('z',"9999");
      db.put(' ',"0");
      
      int t = Integer.parseInt(br.readLine());
      
      StringBuilder sb = new StringBuilder();
            
      for(int test=1; test<=t; test++){
          sb.append("Case #"+test+": ");
          
            String in = br.readLine();
              
            String prev = "x";
            for(int i=0; i<in.length();i++){
                char c = in.charAt(i);
                  
                String s = db.get(c);
                if(prev.charAt(0) == s.charAt(0)){
                    sb.append(" ");
                }
                sb.append(s);
                prev = s;
             }
             
          sb.append("\n");
      }

      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
}
