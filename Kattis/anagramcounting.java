import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner kbd = new Scanner(System.in);
        
        while(kbd.hasNextLine()){
            char[] input = kbd.nextLine().toCharArray();
            
            HashSet<Character> u = new HashSet<>();
            
            for(char s : input){
                u.add(s);
            }
            
            BigInteger length =  factorial(BigInteger.valueOf(input.length));
            
            for(char a : u) {
                BigInteger count = BigInteger.ZERO;
                
                for(char b : input){
                    if(a == b){
                        count = count.add(BigInteger.ONE);
                    }
                }
                length = length.divide(factorial(count));
            }
            System.out.println(length);
        }
        kbd.close();
    }
    
    private static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;
        
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
