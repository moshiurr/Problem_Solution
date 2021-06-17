import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int guest = ss.nextInt() + 1;
      int q = ss.nextInt();
      
      int[] db = new int[guest];
      Map<Integer,Integer> mp = new HashMap<>();
      
      for(int i=1;i<guest;i++){
          db[i] = i;
          mp.put(i,1);
      }
      
      while(q-->=0){
          String[] in = ss.nextLine().split(" ");
          if(in[0].equals("t")){
              int t1 = Integer.parseInt(in[1]);
              int t2 = Integer.parseInt(in[2]);
              
              int root1 = root(db,t1);
              int root2 = root(db,t2);
              
              if(root1 != root2){
                  int sizeRoot = mp.get(root1) + mp.get(root2);
                  mp.put(root1,sizeRoot);
              }
              
              db[root2] = root1;
  
          }else if(in[0].equals("s")){
              int t = Integer.parseInt(in[1]);
              int a = root(db,t);
              int ans = mp.get(a);
              
              ww.write(ans+"\n");
          }
          
      }
      
      ss.close();
      ww.close();
    }
    
    public static int root(int[] Arr, int i){
        while(Arr[i] != i)
        {
            Arr[i] = Arr[Arr[i]] ; 
            i = Arr[i]; 
        }
        return i;
    }
}
