import java.util.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      char[] s = ss.next().toCharArray();
      
      List<Character> db = new ArrayList<>();
      
      
      for(int i=0; i<s.length; i++){
          db.add(s[i]);
      }
      
      char[] hidden = ss.next().toCharArray();
      
      boolean done = true;
      int index=0;
      for(int i=0; i<hidden.length;i++){
          
          if(db.contains(hidden[i])){
              if(!db.get(0).equals(hidden[i])){
                  done = false;
                  break;
              }
              db.remove(0);
          }
      }
      
      if(done && db.size() == 0) ww.write("PASS");
      else ww.write("FAIL");
      
      ss.close();
      ww.close();
    }
}
