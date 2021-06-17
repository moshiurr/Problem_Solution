import java.util.*;
import java.io.*;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      char[] arr = ss.nextLine().toCharArray();
      
      Word head = new Word('%');
      Word pointer = head;
      
      for(int i=0;i<arr.length;i++){
          if(arr[i] == 'L'){
              pointer = pointer.before;
          }
          else if(arr[i] == 'R'){
              pointer = pointer.after;
          }
          else if(arr[i] == 'B') {
              
              Word temp = pointer.before;
              if(pointer.after != null){
                  temp.after = pointer.after;
                  pointer.after.before = temp;
              }else{
                  temp.after = null;
              }
              pointer = temp;
          }
          else {
              Word w = new Word(arr[i]);
              if(pointer.after != null){
                  w.after = pointer.after;
                  pointer.after.before = w;
              }
              pointer.after = w;
              w.before = pointer;
              pointer = w;
          }
          
      }
      
      head = head.after;
      while(head != null){
          ww.write(head.c+"");
          head = head.after;
      }
      
      ss.close();
      ww.close();
    }
    
    public static class Word{
        char c;
        Word before;
        Word after;
        Word(char c){
            this.c=c;
            before = null;
            after = null;
        }
    }
}
