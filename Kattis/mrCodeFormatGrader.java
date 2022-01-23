import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
      StringBuilder sb = new StringBuilder();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int limit = getInt(st.nextToken());
      int n = getInt(st.nextToken());
      
       Queue<Integer> db = new LinkedList<>();
       
       st = new StringTokenizer(br.readLine());
       int[] err = new int[n];
       int[] acc = new int[limit-n];
       int k = 0;
       int l = 0;
       
       for(int i=0;i<n;i++){
           db.add(getInt(st.nextToken()));
       }
       
       for(int i=1; i<=limit;i++){
           if((db.peek() != null) && i==db.peek() ) err[k++] = db.poll();
           else acc[l++] = i;
       }
    
      List<String> ans = formatter(err);
      List<String> ans2 = formatter(acc);
      
      
     
    
      
      sb.append("Errors: ");
      
        int s = ans.size();
        for(int i = 0; i<s-2;i++)
        {
            sb.append(ans.get(i) + ", ");
        }

        sb.append(ans.get(s-2) + " and " +ans.get(s-1));
        
        sb.append("\n");
        sb.append("Correct: ");
        
        s = ans2.size();
        for(int i = 0; i<s-2;i++)
        {
            sb.append(ans2.get(i) + ", ");
        }

        sb.append(ans2.get(s-2) + " and " +ans2.get(s-1));
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    public static List<String> formatter(int[] a)
    {
        int length = 1;
        List<String> list
                = new ArrayList<String>();
        if (a.length == 0) {
            return list;
        }

        for (int i = 1; i <= a.length; i++) {
            if (i == a.length|| a[i] - a[i - 1] != 1) {
                if (length == 1) {
                    list.add(String.valueOf(a[i - length]));
                }
                else {
                    list.add(a[i - length] + "-" + a[i - 1]);
                }
                length = 1;
            }
            else {
                length++;
            }
        }

        return list;
    }
    
    
    public static int getInt(String s){
        return Integer.parseInt(s);
    }   
}
