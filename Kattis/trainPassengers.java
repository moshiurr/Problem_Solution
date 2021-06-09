import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class MyClass {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        long cap = scan.nextLong();
        int n = Integer.parseInt(scan.nextLine().trim());
        
        //long capRem = cap;
        long curPass = 0;
        
        boolean bad = false;
        
        for(int i = 0; i<n; i++){
            long out = scan.nextLong();
            long in = scan.nextLong();
            long stay = scan.nextLong();
            
            // long cur = prev - in + out;
            
            if(curPass - out < 0){
                bad = true;
                break;
            }
            
            curPass = curPass + in - out;
            
            if(curPass > cap){
                bad = true;
                break;
            }
            
            long seatRem = cap -curPass;
            if(seatRem>0 && stay>0 ){
                bad = true;
                break;
            }
            
        }
        
        if(bad || curPass != 0){
             System.out.println("impossible");
        }else {
            System.out.println("possible");
        }
        
    }
}
