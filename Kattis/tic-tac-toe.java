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
          String[] xBoard = {"","",""};
          String[] oBoard = {"","",""};
          int row = 0;
          int xCount = 0;
          int oCount = 0;
          
          while(row<3){
              String line = br.readLine();
              for(int i=0; i<3;i++){
                  if(line.charAt(i) == 'X') {
                      xBoard[row] += 'X';
                      oBoard[row] +='.';
                      xCount++;
                  }else if (line.charAt(i) == 'O') {
                      xBoard[row] += '.';
                      oBoard[row] +='O';
                      oCount++;
                  }else{
                      xBoard[row] += '.';
                      oBoard[row] += '.';
                  }
              }
              row++;
          }
          
          
          boolean xWins = checkWinner(xBoard);
          boolean oWins = checkWinner(oBoard);
          
          if(xWins && oWins) sb.append("no\n");
          else if(xWins && xCount-1 == oCount) sb.append("yes\n");
          else if(oWins && xCount == oCount) sb.append("yes\n");
          else if(!oWins && !xWins && (xCount-1 == oCount || xCount == oCount)) sb.append("yes\n");
          else sb.append("no\n");
          
          br.readLine();
            
        }
    
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    public static boolean checkWinner(String[] board)
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
            if (line.equals("XXX") || line.equals("OOO")) {
                return true;
            }
        }
        return false;
    }
    
    public static int getInt(String s){
        return Integer.parseInt(s);
    }   
}
