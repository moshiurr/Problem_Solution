import java.util.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) throws Exception {
      Scanner ss = new Scanner(System.in);
      BufferedWriter ww = new BufferedWriter(new OutputStreamWriter(System.out));
      
      String line = ss.nextLine();
      
      while(!line.equals("0 0 0 0")){
          String[] numbers = line.split(" ");
          
          String p1 = numbers[0].compareTo(numbers[1]) > 0 ? numbers[0]+""+numbers[1] : numbers[1]+""+numbers[0];
          String p2 = numbers[2].compareTo(numbers[3]) > 0 ? numbers[2]+""+numbers[3] : numbers[3]+""+numbers[2];
        
          boolean p1Wins = false;
          boolean p2Wins = false;
          boolean p1Deuce = false;
          boolean p2Deuce = false;
          
          if(numbers[0].compareTo(numbers[1]) == 0) p1Deuce = true;
          if(numbers[2].compareTo(numbers[3]) == 0) p2Deuce = true;
          
          if(p1.equals("21")) p1Wins = true;
          if(p2.equals("21")) p2Wins = true;
          
          if(!p1Wins && !p2Wins){
              if(p1Deuce) p1Wins = true;
              if(p2Deuce) p2Wins = true;
              
              if((p1Deuce && p2Deuce) || (!p1Deuce && !p2Deuce)) {
                  if(p1.compareTo(p2) == 0){
                      p1Wins = true;
                      p2Wins = true;
                  }else if(p1.compareTo(p2) > 0) {
                      p1Wins = true;
                      p2Wins = false;
                  } else {
                      p2Wins = true;
                      p1Wins = false;
                  }
              }
          }
          
          if(p1Wins && p2Wins) ww.write("Tie.\n");
          else if(p1Wins) ww.write("Player 1 wins.\n");
          else ww.write("Player 2 wins.\n");
          
          line = ss.nextLine();
      }
      
      ss.close();
      ww.close();
    }
}
