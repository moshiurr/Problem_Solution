import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyClass {  
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
      String line;
      int test = 1;
      StringBuilder sb = new StringBuilder();
      
      while((line=br.readLine()) != null){
          
          StringTokenizer st = new StringTokenizer(line);
          int row = Integer.parseInt(st.nextToken());
          int col = Integer.parseInt(st.nextToken());
          
          char[][] db = new char[row][col];
          boolean[][] visited = new boolean [row][col];
          
          for(int i=0; i<row;i++){
              String in = br.readLine();
              for(int j=0;j<col;j++){
                  db[i][j] = in.charAt(j);
                  visited[i][j] = false;
              }
          }
          
          int ans = 0;
          
          for(int i=0; i<row;i++){
              for(int j=0;j<col;j++){
                  if(db[i][j] == '-' && !visited[i][j]){
                      ans++;
                      visited = recurs(db,visited,i,j,row,col);
                  }
              }
          }
          
          
          sb.append("Case "+test+": "+ans);
          sb.append("\n");
          test++;
      }
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }
    
    public static boolean[][] recurs(char[][] db, boolean[][] visited,int i, int j, int row, int col){
         
        if(i>=0 && i<row && j>=0 && j< col && db[i][j] != '#' && !visited[i][j]){
            visited[i][j] = true;
            visited = recurs(db,visited,i,j+1,row,col); //right
            visited = recurs(db,visited, i+1,j,row,col); //down
            visited = recurs(db,visited,i,j-1,row,col); //left
            visited = recurs(db,visited,i-1,j,row,col); //up
        }
         return visited;
    }
}
