import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int t = Integer.parseInt(scan.nextLine());
        int testCase = 1;
        while(testCase <= t){
            int n = Integer.parseInt(scan.nextLine());
            
            List<BigInteger> x = new ArrayList<>();
            List<BigInteger> y = new ArrayList<>();
            
            String line1 = scan.nextLine(); 
            String line2 = scan.nextLine(); 
            
            Scanner lineScanner = new Scanner(line1);
            for(int i=0; i<n; i++){
                BigInteger temp = new BigInteger(lineScanner.next());
                x.add(temp);
            }
            
            lineScanner = new Scanner(line2);
            for(int i=0; i<n; i++){
                BigInteger temp = new BigInteger(lineScanner.next());
                y.add(temp);
            }
            
            Collections.sort(x);
            Collections.sort(y);
            
            
            BigInteger sum = BigInteger.ZERO;
            
            int r = n-1;
            for(int l=0; l<n; l++){
               BigInteger temp = x.get(l).multiply(y.get(r));
               sum = sum.add(temp);
               r--;
            }
            
            System.out.printf("Case #%d: %d%n",testCase,sum);
            
            testCase++;
        }
    }
}
