import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class list {
    public static void main(String s[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Integer[] arr = new Integer[t];
        for(int i=0;i<t;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        long sum = 0;
        for(int i=0;i<t;i++){
            if((i+1)%3 !=0) sum+=arr[i];
        }
        System.out.println(sum);
    }
}
