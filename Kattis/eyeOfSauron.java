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
      
      
    //   StringTokenizer st = new StringTokenizer(br.readLine(), ";");
    String in = br.readLine();
    
    int count = 0;
    boolean found = false;
    
    for(int i=0; i<in.length();i++){
        
        if(in.charAt(i) == '('){
            found = true;
            i++;
            continue;
        }
        if(in.charAt(i) == '|' && !found) count++;
        else count--;
    }
    
    if(count == 0) sb.append("correct");
    else sb.append("fix");
     
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    public static int getInt(String s){
        return Integer.parseInt(s);
    }   
}
