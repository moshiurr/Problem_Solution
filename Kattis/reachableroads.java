import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      int house = ss.nextInt() + 1;
      int n = ss.nextInt();
      int[] db = new int[house];
      
      for(int i=1;i<house;i++){
          db[i] = i;
      }
      
      for(int i=0; i<n;i++){
          int n1 = ss.nextInt();
          int n2 = ss.nextInt();
          
          int r1 = root(db,n1);
          int r2 = root(db,n2);
          db[r2] = r1;
      }
      
      boolean connected = true;
      
      int m_r = root(db,1);
      
      for(int i=2;i<house;i++){
          if(m_r != root(db,i)){
              connected = false;
              ww.write(i+"\n");
          } 
      }
      if(connected) ww.write("connected\n");
      
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
