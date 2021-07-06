import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class island {  
    static boolean[][] visited;
    static int[][] db;
    static int[][] mem;
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

          int ans = shortestPath(row-1, col-1);

      sb.append(ans);
      
      out.write(sb.toString().getBytes());
      
      br.close();
      out.close();
    }

    public static int shortestPath(int fx, int fy){

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0,0));
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            Pair p = q.remove();
            if(p.x == fx && p.y == fy) return p.dis;

            int jump = db[p.x][p.y];
            //up
            if (p.x - jump >= 0 && visited[p.x - jump][p.y] == false){
                q.add(new Pair(p.x-jump,p.y,p.dis+1));
                visited[p.x-jump][p.y] = true;
            }

            //right
            if (p.y + jump <= fy && visited[p.x][p.y+jump] == false){
                q.add(new Pair(p.x,p.y+jump,p.dis+1));
                visited[p.x][p.y+jump] = true;
            }

            //down
            if (p.x + jump <= fx && visited[p.x + jump][p.y] == false){
                q.add(new Pair(p.x+jump,p.y,p.dis+1));
                visited[p.x+jump][p.y] = true;
            }

            //left
            if (p.y - jump >=0 && visited[p.x][p.y-jump] == false){
                q.add(new Pair(p.x,p.y-jump,p.dis+1));
                visited[p.x][p.y-jump] = true;
            }
        }
        return -1;
    }

    public static class Pair{
        int x;
        int y;
        int dis;
        Pair(int r,int c,int z){
            this.x = r;
            this.y = c;
            this.dis = z;
        }
    }
}
