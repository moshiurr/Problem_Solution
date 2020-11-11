import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.next());
        for(int i=0; i<t;i++){
            int s = Integer.parseInt(scan.next());
            double x_pos = 0.0;
            double y_pos = 0.0;
            double degree = 0.0;
            for(int j=0;j<s;j++){
                double x, dis;
                x = Double.parseDouble(scan.next());
                dis = Double.parseDouble(scan.next());
                double d = ((Math.PI * x / 180));
                d *= (-1);
                degree+=d;
                x_pos += dis * Math.sin(degree);
                y_pos += dis * Math.cos(degree);
            }
            System.out.printf("%.6f %.6f%n",x_pos,y_pos);
        }
    }
}
