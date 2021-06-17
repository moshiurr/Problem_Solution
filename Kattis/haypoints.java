import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int m = ss.nextInt();
      int n = ss.nextInt();
      
      Map<String, Long> db = new HashMap<>();
      
      for(int i=0;i<m; i++){
          db.put(ss.next(), ss.nextLong());
      }
      
      for(int i=0;i<n;i++){
          long salary = 0;
          String des = ss.nextLine();
          while(!des.equals(".")){
              String[] desArr = des.split(" ");
              for(int j=0;j<desArr.length; j++){
                  if(db.containsKey(desArr[j])) salary += db.get(desArr[j]);
              }
              des = ss.nextLine();
          }
          ww.write(salary+"\n");
      }
      
      
      ss.close();
      ww.close();
    }
}
