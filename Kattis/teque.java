import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);


      int n = Integer.parseInt(br.readLine());
      
      Map<Integer, Integer> firstHalf = new HashMap<>();
      Map<Integer, Integer> secondHalf = new HashMap<>();
      
      int f_start = -1;
      int f_end = 0;
      int b_start = -1;
      int b_end = 0;
      
      StringBuilder ans = new StringBuilder();
      for(int i=0; i<n;i++){
          StringTokenizer st = new StringTokenizer(br.readLine());
          String in = st.nextToken();
          int number = Integer.parseInt(st.nextToken());
          
          if(in.equals("push_front")){
              firstHalf.put(f_start--, number);
          }else if(in.equals("push_middle")){
              firstHalf.put(f_end++,number);
              
          }else if(in.equals("push_back")){
              secondHalf.put(b_end++,number);
          }else{
              if(number<firstHalf.size()){
                  //ww.write(firstHalf.get(number+f_start+1)+"\n");
                  ans.append(firstHalf.get(number+f_start+1));
              }else{
                  //ww.write(secondHalf.get(number-firstHalf.size()+b_start+1)+"\n");
                  ans.append(secondHalf.get(number-firstHalf.size()+b_start+1));
              }
              ans.append("\n");
          }
          
          if(firstHalf.size() < secondHalf.size()){
              firstHalf.put(f_end++,secondHalf.get(b_start+1));
              secondHalf.remove(++b_start);
          }else if(firstHalf.size()-1 > secondHalf.size()){
              secondHalf.put(b_start--,firstHalf.get(f_end-1));
              firstHalf.remove(--f_end);
          }
          
      }
      
      out.write(ans.toString().getBytes());
      
      br.close();
      out.close();
    }
}
