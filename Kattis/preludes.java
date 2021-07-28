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

      StringTokenizer st;
      
      Map<String,String> db = new HashMap<>();
      
      db.put("Ab","G#");
      db.put("A#","Bb");
      db.put("Bb","A#");
      db.put("C#","Db");
      db.put("Db","C#");
      db.put("D#","Eb");
      db.put("Eb","D#");
      db.put("F#","Gb");
      db.put("Gb","F#");
      db.put("G#","Ab");

      String input;
      int test = 1;

      while((input=br.readLine()) != null){
          st = new StringTokenizer(input);
          String note = st.nextToken();
          sb.append("Case "+test+": ");
          if(db.containsKey(note)){
              sb.append(db.get(note)+" "+st.nextToken()+"\n");
          }else sb.append("UNIQUE\n");
          
          test++;
      }

      out.write(sb.toString().getBytes());
      br.close();
      out.close();
  }

  static int getint(String s){
    return Integer.parseInt(s);
  }
}
