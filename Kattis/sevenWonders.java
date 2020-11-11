import java.util.Scanner;

public class SevenWonder {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        String input = kbd.nextLine().trim();

        int T=0,G=0,C=0, A=0;

        for(int i=0; i<input.length(); i++){
            String s = input.substring(i,i+1);
            if(s.equalsIgnoreCase("t"))T++;
            else if(s.equalsIgnoreCase("c"))C++;
            else if(s.equalsIgnoreCase("g"))G++;
        }

        if(T<=G && T<=G) A =T*7;
        else if(G<=T && G<=C) A = G*7;
        else A = C*7;

        System.out.println(T*T+C*C+G*G+A);
    }

}
