import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
      
        while(scan.hasNextLine()){
            String s = scan.nextLine();
            Scanner lineScanner = new Scanner(s);
            
            int total = 0;
            while(lineScanner.hasNext()){
                int in = lineScanner.nextInt();
                total += in;
            }
            
            System.out.println(total/2);
            
        }
    }
}
