import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
      StringBuilder sb = new StringBuilder();
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = getInt(st.nextToken());
      while(n-->0){
          String oct = br.readLine();
          int octal = Integer.parseInt(oct, 8);
 
          String bv = Integer.toBinaryString(octal);
          String mmm = "";
          if(bv.length() < 19){
              int temp = 19-bv.length();
              while(temp-->0) mmm+="0";
          }
          bv = mmm+bv;
          
          
          String board[] = {"","",""}; 
          
          int count = 0;
          
          for(int i=bv.length()-1; i>=0;){
              if(count==3) break;
              int step = 3;
              while(step-->0){
                  if(bv.charAt(i) == '1'){
                    if(bv.charAt(i-9) == '1'){
                        board[count] = board[count] + "X";
                    }else if(bv.charAt(i-9) == '0'){
                      board[count] = board[count] + "O";
                    }
                  }else{
                      board[count] =  board[count] + "Q";
                  } 
                i--;
              }
              
              count++;
            }
    
            
            String ans = checkWinner(board);
            sb.append(ans+"\n");
        
              
        }
    
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    public static String checkWinner(String[] board)
    {
        for (int a = 0; a < 8; a++) {
            String line = "";
  
            switch (a) {
            case 0:
                line = ""+board[0].charAt(0) + board[0].charAt(1) + board[0].charAt(2);
                break;
            case 1:
                line = ""+board[1].charAt(0) + board[1].charAt(1) + board[1].charAt(2);
                break;
            case 2:
                line = ""+board[2].charAt(0) + board[2].charAt(1) + board[2].charAt(2);
                break;
            case 3:
                line = ""+board[0].charAt(0) + board[1].charAt(0) + board[2].charAt(0);
                break;
            case 4:
                line = ""+board[0].charAt(1) + board[1].charAt(1) + board[2].charAt(1);
                break;
            case 5:
                line = ""+board[0].charAt(2) + board[1].charAt(2) + board[2].charAt(2);
                break;
            case 6:
                line = ""+board[0].charAt(0) + board[1].charAt(1) + board[2].charAt(2);
                break;
            case 7:
                line = ""+board[0].charAt(2) + board[1].charAt(1) + board[2].charAt(0);
                break;
            }
            if (line.equals("XXX")) {
                return "X wins";
            }
            else if (line.equals("OOO")) {
                return "O wins";
            } 
        }
        for(int i=0;i<3;i++){
            if(board[i].contains("Q")) return "In progress";
        }
        return "Cat's";
    }
    
    public static int getInt(String s){
        return Integer.parseInt(s);
    }   
}
