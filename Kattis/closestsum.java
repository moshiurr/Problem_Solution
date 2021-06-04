import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner kbd = new Scanner(System.in);
      
      int testCase = 1;
      
      while(kbd.hasNext()){
          System.out.printf("Case %d:%n",testCase);
          int n = Integer.parseInt(kbd.nextLine());
          
          int[] arr = new int[n];
          
          for(int i=0; i<n; i++){
              arr[i] = Integer.parseInt(kbd.nextLine());
          }
          
          int m = Integer.parseInt(kbd.nextLine());
          
          for(int i=0; i<m; i++){
              int target = Integer.parseInt(kbd.nextLine());
              
              int least_diff = Integer.MAX_VALUE;
              int closest_sum = 0;
              
              for(int x=0;x<n;x++){
                  for(int y=x+1;y<n;y++){
                      int temp = arr[x]+arr[y];
                      int temp_diff = Math.abs(target-temp);
                      if(temp_diff<least_diff){
                          least_diff = temp_diff;
                          closest_sum = temp;
                      }
                  }
              }
              
              System.out.printf("Closest sum to %d is %d.%n",target,closest_sum);
          }
      
          testCase++;
      }
      
    }
}
