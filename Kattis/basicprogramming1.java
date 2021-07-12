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
      int n = getint(st.nextToken());
      int cmd = getint(st.nextToken());

      int[] arr = new int[n];
      char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      st = new StringTokenizer(br.readLine());
      long sum = 0;
      long evenSum = 0;
      for(int i=0; i<n;i++){
        arr[i] = getint(st.nextToken());
        sum+=arr[i];
        if(arr[i]%2==0) evenSum+=arr[i];
  
      }

      if(cmd == 1){
        sb.append(7);
      }else if(cmd == 2){
        if(arr[0]>arr[1]) sb.append("Bigger");
        else if(arr[0] == arr[1]) sb.append("Equal");
        else sb.append("Smaller");
      }else if(cmd == 3){
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int large = (Math.max(a,Math.max(b,c)));
        if(a == large) sb.append(Math.max(b,c));
        else if(b == large) sb.append(Math.max(a,c));
        else sb.append(Math.max(a,b));
      }else if(cmd == 4){
        sb.append(sum);
      }else if(cmd == 5){
        sb.append(evenSum);
      }else if(cmd == 6){
        for(int i=0; i<n;i++){
          sb.append(alpha[arr[i]%26]);
        }
      }else{
        Set<Integer> db = new HashSet<>();
        int i = 0;
        while(true){
          int size = db.size();
          db.add(i);
          if(arr[i]<0 || arr[i]>n-1){
            sb.append("Out");
            break;
          }
          if((n-1) == i){
            sb.append("Done");
            break;
          }
          if(size == db.size()){
            sb.append("Cyclic");
            break;
          }

          i = arr[i];
        }
      }



      out.write(sb.toString().getBytes());
      br.close();
      out.close();
  }

  static int getint(String s){
    return Integer.parseInt(s);
  }
}
