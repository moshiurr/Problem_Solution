import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner kbd = new Scanner(System.in);
        
        int in = getNum(kbd.next());
        int out = getNum(kbd.next());
        int other = getNum(kbd.next());
        
        boolean done = false;
        if((out+1)%4 == in) {
            if(((in+2)%4 == other || (in+1)%4 == other)){
                System.out.println("Yes");
                done = true;
            }
        }else if((in+2)%4 == out){
            if((in+1)%4 == other){
                System.out.println("Yes");
                done = true;
            }
        }
        
        if(!done) System.out.println("No");
    }
    
    public static int getNum(String dir){
        switch(dir){
            case "North" : return 2;
            case "East" : return 1;
            case "South" : return 0; 
            case "West" : return 3;
            default: return -1;
        }
    }
}
