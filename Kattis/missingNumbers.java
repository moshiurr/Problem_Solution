import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int count = 1;
      int n = Integer.parseInt(scan.nextLine());
      
      boolean done = false;
      
      for(int i=0;i<n;i++){
        int x = Integer.parseInt(scan.nextLine());
          while(count<x){
              done = true;
             System.out.println(count++);
          }
        count++;
      }
        
      if(!done) System.out.println("good job");
    }
}
