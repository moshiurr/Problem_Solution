import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.next());
        int price = Integer.parseInt(scan.nextLine().trim());
        
        int[] db = new int[n];
        
        for(int i=0; i<n;i++){
            db[i] = scan.nextInt()-price;
        }
        
        //kadane's algorithm
        int maxEndHere = db[0];
        int maxSoFar = db[0];
        
        for(int i=1;i<n;i++){
            maxEndHere += db[i];
            if(maxEndHere < db[i]) maxEndHere = db[i];
            if(maxEndHere > maxSoFar) maxSoFar = maxEndHere;
        }
        System.out.print(maxSoFar);

    }
}
