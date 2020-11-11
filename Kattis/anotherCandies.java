import java.math.BigInteger;
import java.util.Scanner;

public class Candies {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        int testCases=Integer.parseInt(in.nextLine());
        for(int i=0; i<testCases; i++){
            in.nextLine();
            int num=Integer.parseInt(in.nextLine());
            BigInteger result=new BigInteger("0");
            for(int j=0; j<num; j++){
                result=result.add(BigInteger.valueOf(Long.parseLong(in.nextLine())));
            }
            if(result.mod(BigInteger.valueOf(num)).equals(BigInteger.valueOf(0))){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
