import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);

      Map<Character, String> db = new HashMap<>();
      db.put('a',"@");
      db.put('b',"8");
      db.put('c',"(");
      db.put('d',"|)");
      db.put('e',"3");
      db.put('f',"#");
      db.put('g',"6");
      db.put('h',"[-]");
      db.put('i',"|");
      db.put('j',"_|");
      db.put('k',"|<");
      db.put('l',"1");
      db.put('m',"[]\\/[]");
      db.put('n',"[]\\[]");
      db.put('o',"0");
      db.put('p',"|D");
      db.put('q',"(,)");
      db.put('r',"|Z");
      db.put('s',"$");
      db.put('t',"']['");
      db.put('u',"|_|");
      db.put('v',"\\/");
      db.put('w',"\\/\\/");
      db.put('x',"}{");
      db.put('y',"`/");
      db.put('z',"2");
      
      
      StringBuilder ans = new StringBuilder();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      while(st.hasMoreTokens()){
          char[] arr = st.nextToken().toLowerCase().toCharArray();
          for(int i=0; i<arr.length;i++){
              if(db.containsKey(arr[i])) ans.append(db.get(arr[i]));
              else ans.append(arr[i]);
          }
          ans.append(" ");
      }
      
      out.write(ans.toString().getBytes());
      
      br.close();
      out.close();
    }
}
