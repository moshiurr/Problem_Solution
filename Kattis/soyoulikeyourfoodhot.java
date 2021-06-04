import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
      
        int pt = (int)fix(scan.nextDouble() * 100);
        int p1 = (int)fix(scan.nextDouble() * 100);
        int p2 = (int)fix(scan.nextDouble() * 100);
        int count = 0;
        
        int res = pt/p1;
        
        for(int i=0; i<=res; i++){
        int t = (pt - (p1*i))/p2;
        if(((t*p2)+(i*p1)) == pt) {
            count++;
            System.out.printf("%d %d%n", i,t);
        }
    }
        if (count == 0) System.out.println("none");
        
        scan.close();
    }
    private static double fix(double a) {
        return Math.round(a * 100) / 100d;
    }

}
