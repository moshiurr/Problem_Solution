import java.util.*;

public class list {
    public static void main(String s[]) {
        Scanner scan = new Scanner(System.in);
        double p,a,b,c,d;
        int n;
        p = Double.parseDouble(scan.next());
        a = Double.parseDouble(scan.next());
        b = Double.parseDouble(scan.next());
        c = Double.parseDouble(scan.next());
        d = Double.parseDouble(scan.next());
        n = scan.nextInt();
        double max = p * ((Math.sin(a+b) + Math.cos(c+d))+2);
        double max_dif=0;
        for(int i=1;i<=n;i++){
            double curr = p * ((Math.sin(a*i+b) + Math.cos(c*i+d))+2);
            if(max>curr){
                if(max_dif<max-curr){
                    max_dif = max-curr;
                }
            }else max = curr;
        }

        System.out.printf("%.7f",max_dif);

    }
}
