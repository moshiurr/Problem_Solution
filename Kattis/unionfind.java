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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] db = new int[n+1];
        for(int i=0;i<n+1;i++)
            db[i] = i;

        while(m-->0){
            st = new StringTokenizer(br.readLine());
            char cmd = st.nextToken().charAt(0);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(cmd == '?'){
                String ans = root(db,x) == root(db, y) ? "yes\n" : "no\n";
                sb.append(ans);
            }else{
                int rootX = root(db,x);
                int rootY = root(db,y);
                db[rootY] = rootX;
            }
        }

        out.write(sb.toString().getBytes());

        br.close();
        out.close();
    }

    public static int root(int[] Arr, int i){
        while(Arr[i] != i)
        {
            Arr[i] = Arr[Arr[i]] ; 
            i = Arr[i]; 
        }
        return i;
    }
}
