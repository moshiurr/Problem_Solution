import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int ans = 0;
      
      char[] arr = scan.nextLine().toCharArray();
      
      for(int i=0;i<arr.length; i++){
          if(i%3 == 0 && arr[i] != 'P') ans++;
          if(i%3 == 1 && arr[i] != 'E') ans++;
          if(i%3 == 2 && arr[i] != 'R') ans++;
      }
      
      System.out.println(ans);
      
    }
}
