import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D{
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Map<String,Integer> db = new HashMap<>();
        int p = Integer.parseInt(kbd.next());

        long s = 0;
        long total = 0;


        while (p>0){
            String tag = kbd.next();
            String flag = kbd.next();
            if(db.containsKey(tag)){
                if(flag.equalsIgnoreCase("wrong")){
                    db.put(tag, db.get(tag)+20);
                }else{
                    total = total + db.get(tag) + p;
                    s++;
                }
            }else if(flag.equalsIgnoreCase("wrong")){
                db.put(tag,20);
            }else {
                s++;
                total+=p;
            }
            p = Integer.parseInt(kbd.next());
        }
        System.out.print(s+" "+total);
    }
}
