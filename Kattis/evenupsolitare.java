import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class list {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);

      StringBuilder sb = new StringBuilder();

      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(" ");

        Stack<Integer> db = new Stack<>();
        db.push(Integer.parseInt(arr[0]));

        for(int i=1; i<n;i++){
            int num = Integer.parseInt(arr[i]);
            if((db.peek()+num)%2 == 0){
                db.pop();
                if(db.size() == 0 && i+1<n) db.push(Integer.parseInt(arr[++i]));
            }else db.push(num);
        }

 
      sb.append(db.size());
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }

}
