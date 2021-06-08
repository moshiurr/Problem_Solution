import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        
        for(int i=0; i<n;i++){
            String[] arr = scan.nextLine().split(" ");
            Set<String> db = new HashSet<>();
            String[] animal = scan.nextLine().split(" ");
            
            while(!animal[0].equals("what")){
                db.add(animal[2]);
                animal = scan.nextLine().split(" ");
            }
            for(int j=0; j<arr.length; j++){
                if(!db.contains(arr[j])) System.out.print(arr[j]+" ");
            }
            
        }
    }
}
