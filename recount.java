import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
     
      Map<String, Long> db = new HashMap<>();
      
      String ans="";
      long max = 1;
      
      String s = scan.nextLine();
      
      while(!s.equals("***")){
          if(db.containsKey(s)){
              long m = db.get(s) + 1;
              if(m>=max){
                  max = m;
                  ans=s;
              }
              db.put(s,m);
          }else db.put(s,Long.valueOf(1));
          
          s = scan.nextLine();
      }
      long duplicate = 0;
      for(String n: db.keySet()){
        if(db.get(n) == max) duplicate++;
      }
      
      if(duplicate > 1) System.out.println("Runoff!");
      else System.out.println(ans);
      
      
    }
}
