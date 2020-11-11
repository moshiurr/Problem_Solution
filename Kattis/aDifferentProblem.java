import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class list {
    public static void main(String s[]) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            long a = scan.nextLong();
            long b = scan.nextLong();
            System.out.println(Math.abs(a-b));
        }
    }
}
