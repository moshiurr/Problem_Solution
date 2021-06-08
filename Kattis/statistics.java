import java.util.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int test = 1;
      while(ss.hasNextLine()){
          String s = ss.nextLine();
          Scanner ll = new Scanner(s);
          int n = ll.nextInt();
          int max= Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;
          
          for(int i=0;i<n;i++){
              int temp = ll.nextInt();
              max = Math.max(temp, max);
              min = Math.min(temp, min);
          }
          
          ww.write("Case "+test+": "+min+" "+max+" "+(max-min)+"\n");
          
          test++;
      }
      
      ss.close();
      ww.close();
    }
}
