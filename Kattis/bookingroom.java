import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner kbd = new Scanner(System.in);
        
        int room = kbd.nextInt();
        int n = kbd.nextInt();
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(kbd.nextInt());
        }
        
        boolean done = true;
        for(int i=1;i<=room;i++){
            if(!set.contains(i)){
                done = false;
                System.out.println(i);
                break;
            }
        }
        
        if(done){
            System.out.println("too late");
        }
    }
}
