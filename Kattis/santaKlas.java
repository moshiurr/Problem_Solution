import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.next());
        int d = Integer.parseInt(scan.next());
        if(d<=180){
            System.out.println("safe");
        }else{
            double rd = ((Math.PI * d / 180)+(Math.PI/2));

            double c = Math.cos(rd);
            double res = h/c;
            System.out.println((int)res);
        }
    }
}
