import java.util.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      Map<String, Integer> db = new HashMap<>();

      while(ss.hasNextLine()){
        String command = ss.next();
        String s = ss.nextLine().trim();
        String[] arr = s.split(" ");

        if(command.equals("def")){
          db.put(arr[0], Integer.parseInt(arr[1]));
        }else if(command.equals("calc")){
            
          int total = -999999;
          int y = -999999;

          if(db.containsKey(arr[0])) total = db.get(arr[0]);

          boolean possible = true;
          
          for(int i=2; i<arr.length && possible ; i+=2){
            
            if(db.containsKey(arr[i])) y = db.get(arr[i]);

            if(total == -999999 || y == -999999){
              possible = false;
            } 
            else{
              if(arr[i-1].equals("+")){
                total += y;
              }else{
                total -= y;
              }
            }
            y = -999999;
          }
          
            Set<String> keys = db.keySet();
            boolean found = false;
            String ans = "";
            for(String k : keys ){
                if(db.get(k) == total){
                    found = true;
                    ans = k;
                    break;
                } 
            }
        
            if(found && possible) ww.write(s+" "+ans+"\n");
            else ww.write(s+" unknown\n");
            
            found = false;
          
        }else{
            db.clear();
          }
      }
      
      ss.close();
      ww.close();
    }
}
