import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      Map<String, String> db = new HashMap<>();
      
      while(ss.hasNextLine()){
          String in = ss.nextLine();
          
          if(in.equals("")) continue;
          else{
              String input[] = in.split(" ");
              if(input.length != 2){
                  if(db.containsKey(input[0])) ww.write(db.get(input[0])+"\n");
                  else ww.write("eh\n");
              }
              else db.put(input[1], input[0]);
          }
      }
      
      ss.close();
      ww.close();
    }
}
