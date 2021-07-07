import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;

public class list {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);

      StringBuilder sb = new StringBuilder();

      int n = Integer.parseInt(br.readLine());
      while(n != 0){ 

        int[] arr = new int[n];
        int[] copyArr = new int[n];
        int[] brr = new int[n];

        Map<Integer,Integer> db = new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            copyArr[i] = arr[i];
        }
            
        for(int i=0;i<n;i++)
            brr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(copyArr);
        Arrays.sort(brr);

        for(int i =0; i<n; i++){
            db.put(copyArr[i],brr[i]);
        }

        for(int i=0; i<n;i++){
            sb.append(db.get(arr[i])+"\n");
        }

        sb.append("\n");
        n = Integer.parseInt(br.readLine());
      }
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
}
