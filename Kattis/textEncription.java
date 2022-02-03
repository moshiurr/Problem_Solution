import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;

public class MyClass {  
  public static void main(String args[]) throws Exception {

    //this is for testing on my computer
    //   BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("input.txt"))));
    // this is when submitting to judge online
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
      StringBuilder sb = new StringBuilder();
      
      //StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(br.readLine());
      
      while(n!=0){

        String line = br.readLine().toUpperCase();
        line = line.replaceAll(" ", "");
        int len = line.length();

        // int bp = len%2 == 0 ? len/n : (len/n) + 1;

        if(len<n){
            sb.append(line+"\n");
            n = Integer.parseInt(br.readLine());
            continue;
        }

        char[] arr = new char[len];
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<len;i++){
            if(count2<len){
                arr[count2] = line.charAt(i);
                count2+=n;
            }else{
                arr[++count1] = line.charAt(i);
                count2 = count1 + n;
            }
        }

        String ans ="";

        for(int i=0 ;i<len;i++) ans+=arr[i];

        sb.append(ans+"\n");

        n = Integer.parseInt(br.readLine());
      }
    
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
}
