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

      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = getint(st.nextToken());

      while(n-->0){
        String command = br.readLine();
        int item = getint(br.readLine());
        st = new StringTokenizer(br.readLine(),",");

        Deque<String> db = new LinkedList<>();
        
        for(int i=0;i<item;i++){
          db.add(st.nextToken().replace("[","").replace("]",""));
        }

        boolean reverse = false;
        boolean error = false;

        for(int i=0;i<command.length();i++){
          if(command.charAt(i) == 'R') reverse = !reverse;
          else if(command.charAt(i) == 'D'){
            if(db.size() == 0){
              error = true;
              break;
            }else if(reverse) db.removeLast();
            else db.removeFirst();
          }
        }

        if(error) sb.append("error");
        else{
          if(db.size()==0)sb.append("[]");
          else{
            sb.append("[");
            int count = 1;
            if(reverse){
              for(Iterator itr = db.descendingIterator();itr.hasNext();){
                if(count < db.size()){
                  sb.append(itr.next()+",");
                }else sb.append(itr.next());
                count++;
              }
            }else{
              for(Iterator itr = db.iterator();itr.hasNext();){
                if(count < db.size()){
                  sb.append(itr.next()+",");
                }else sb.append(itr.next());
                count++;
              }
            }

            sb.append("]");
          }
        }
        sb.append("\n");
      }
 

      out.write(sb.toString().getBytes());
      br.close();
      out.close();
  }

  static int getint(String s){
    return Integer.parseInt(s);
  }
}
