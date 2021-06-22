import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int N = ss.nextInt();
      int t = ss.nextInt();
      
      if(t == 1) seven(ss,ww,N);
      else if(t == 2) unique(ss,ww,N);
      else if( t==3 ) moreThanN(ss,ww,N);
      else if(t==4) median(ss,ww,N);
      else if(t==5) sorted(ss,ww,N);
      
      ss.close();
      ww.close();
    }
    
    public static void seven(Scanner ss, BufferedWriter ww, int N) throws Exception{
        //int[] arr = new int[N];
        Map<Integer,Integer> db = new HashMap<>();
        
        boolean found = false;
        
        for(int i=0; i<N;i++){
            int in = ss.nextInt();
            
            if(db.containsKey(in)){
                found = true;
                break;
            }
            else {
                db.put(7777-in,1);
            }
        }
        
        if(found) ww.write("Yes\n");
        else ww.write("No\n");

    }
    
    public static void unique(Scanner ss, BufferedWriter ww, int N) throws Exception{
        
        Set<Integer> db = new HashSet<>();
        
        for(int i=0; i<N;i++){
            db.add(ss.nextInt());
        }
        
        if(db.size() == N) ww.write("Unique\n");
        else ww.write("Contains duplicate\n");
    }
    
    public static void moreThanN(Scanner ss, BufferedWriter ww, int N) throws Exception{
        int half = N/2;
        Map<Integer,Integer> db = new HashMap<>();
        Set<Integer> ans = new HashSet<>();
        
        for(int i=0; i<N;i++){
            int in = ss.nextInt();
            
            if(db.containsKey(in)){
                int count = db.get(in)+1;
                db.put(in,count);
                if(count>half) ans.add(in);
            }
            else {
                db.put(in,1);
            }
        }
        
        if(ans.size() == 0) ww.write("-1\n");
        else{
            for(int a : ans) ww.write(a+" ");
        }
        
    }
    
    public static void median(Scanner ss, BufferedWriter ww, int N) throws Exception{
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++) arr[i] = ss.nextInt();
        
        Arrays.sort(arr);
        
        if(N%2 == 0){
            ww.write(arr[N/2 -1]+" "+arr[N/2]);
        }else ww.write(arr[N/2]+"");
    }
    
    public static void sorted(Scanner ss, BufferedWriter ww, int N) throws Exception{
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++) arr[i] = ss.nextInt();
        
        Arrays.sort(arr);
        
        for(int i=0; i<N;i++){
            if(arr[i]>=100 && arr[i]<=999) ww.write(arr[i]+" ");
        }
    }
    
}
