import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class MyClass {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        Map<String,String> db = new HashMap<>();
        String ans = "";
        while(scan.hasNext()){
            String w = scan.next();
            String lw = w.toLowerCase();
            if(!db.containsKey(lw)){
                db.put(lw,w);
                ans = ans + " " + w;
            }else{
                ans = ans + " ." ;
            }
        }
        
        System.out.print(ans);
    }
}
