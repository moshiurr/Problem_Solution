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
      
      int[] db = new int[in.length()+1];
      
      for(int i=1;i<=in.length();i++){
          char c = in.charAt(i-1);
          if(c == 'R') db[i] = 1;
          else db[i] = -1;
      }
      
      int max_so_far = Integer.MIN_VALUE, max_ending_here = 0, start = 1, end = 1, s = 1 , 
      min_so_far = Integer.MAX_VALUE, min_ending_here = 0, a = 1, b = 1, c = 1;
 
        for (int i = 1; i <=in.length(); i++)
        {
            max_ending_here = max_ending_here+db[i];
 
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
            
            min_ending_here += db[i];
 
            if (min_so_far > min_ending_here) {
                min_so_far = min_ending_here;
                a = c;
                b = i;
            }
            
            if (min_ending_here > 0) {
                min_ending_here = 0;
                c = i + 1;
            }
        }
        
        int x=0,y=0;
        
        if(Math.abs(min_so_far) > Math.abs(max_so_far) || (Math.abs(min_so_far) == Math.abs(max_so_far) && a<start) || (Math.abs(min_so_far) == Math.abs(max_so_far) && b<end)){
            x = a;
            y = b;
        } else if( Math.abs(min_so_far) < Math.abs(max_so_far) || (Math.abs(min_so_far) == Math.abs(max_so_far) && a>start) || (Math.abs(min_so_far) == Math.abs(max_so_far) && b>end)){
            x = start;
            y = end;
        }

      sb.append(x+" "+y+"\n");
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
}
