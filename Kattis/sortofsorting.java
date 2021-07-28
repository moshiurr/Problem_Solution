import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int t = Integer.parseInt(scan.nextLine());
      
      while(t != 0){
          List<String> list = new ArrayList<>();
          
          for(int i=0; i<t;i++){
              list.add(scan.nextLine());
          }
          
          Collections.sort(list, new Comparator<String>() {
             
              public int compare(String a, String b){
                  String a1 = a.substring(0,2);
                  String b1 = b.substring(0,2);
                  
                  return a1.compareTo(b1);
              }
          });
          
          for(String s : list){
              System.out.println(s);
          }
          System.out.println();
          t = Integer.parseInt(scan.nextLine());
      }
      
    }
}
