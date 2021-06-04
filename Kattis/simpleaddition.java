import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner kbd = new Scanner(System.in);
        
        String a = kbd.nextLine();
        String b = kbd.nextLine();
        
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);
        System.out.println(A.add(B));
    }
}
