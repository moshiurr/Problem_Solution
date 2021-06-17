import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int h = ss.nextInt();
      long elements = (long) Math.pow(2,h+1);
      
      long currentIndex = 1;
      String input = ss.nextLine().trim();
      for(int i=0; i<input.length(); i++){
          if(input.charAt(i) == 'L'){
              currentIndex *= 2;
          }else currentIndex = currentIndex*2 + 1;
      }
      
      ww.write(elements - currentIndex+"");
      
      ss.close();
      ww.close();
    }
}
