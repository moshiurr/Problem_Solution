import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class island {  
    static boolean[][] visited;
    static int[][] db;
  public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedOutputStream out = new BufferedOutputStream(System.out);
      
 
      StringBuilder sb = new StringBuilder();

          
          StringTokenizer st = new StringTokenizer(br.readLine());
          int row = Integer.parseInt(st.nextToken());
          int col = Integer.parseInt(st.nextToken());
          
          db = new int[row][col];
          visited = new boolean [row][col];
          
          for(int i=0; i<row;i++){
              String in = br.readLine();
              for(int j=0;j<col;j++){
                  db[i][j] = in.charAt(j) - '0';
                  visited[i][j] = false;
              }
          }

          int ans = dfs(0,0,row,col);

          
      sb.append(ans);
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }

    public static int dfs(int i, int j, int row, int col){
        if(i==row-1 && j == col-1) return 0;

        int step = 0;
        if(i>=0 && i<row && j>=0 && j<col && !visited[i][j]){
            visited[i][j] = true;
            int jump = db[i][j];
            step = dfs(i,j+jump,row,col);
            if(step < 0) step = dfs(i+jump,j,row,col);
            else return 1+step;
            if(step < 0) step = dfs(i,j-jump,row,col);
            else return 1+step;
            if(step < 0) step = dfs(i-jump,j,row,col);
            else return 1+step;
        }
        return -1;
    }
}
