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

      String in = br.readLine();
      Map<Character,Integer> mp = new HashMap<>();
      int[] db = new int[in.length()];

      for(int i=0; i<in.length();i++){
          db[i] = Integer.MAX_VALUE;
          char c = in.charAt(i);
          if(mp.containsKey(c)){
            db[mp.get(c)]++;
          }else{
              db[i] = 1;
              mp.put(c,i);
          }
      }
      if(mp.size()<=2)sb.append(0);
      else{
          Arrays.sort(db);
          int del = mp.size()-2;
          int ans = 0;
          for(int i=0; i<del;i++)ans+=db[i];
          sb.append(ans);
      }
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }

}
