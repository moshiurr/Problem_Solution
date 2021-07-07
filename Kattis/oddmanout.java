import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class MyClass {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream out = new BufferedOutputStream(System.out);
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int test=1; test<=T;test++){
            int g = Integer.parseInt(br.readLine());
            Map<Integer, Integer> db = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(g-->0){
                
                int n = Integer.parseInt(st.nextToken());
                if(db.containsKey(n)) db.remove(n);
                else db.put(n,1);
            }
            Set<Integer> ans = db.keySet();
            sb.append("Case #"+test+": ");
            for(int num : ans) sb.append(num);
            sb.append("\n");
        }

        

        out.write(sb.toString().getBytes());

        br.close();
        out.close();
    }

}
