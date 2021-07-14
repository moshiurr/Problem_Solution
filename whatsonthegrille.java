import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class grille {

    static int db[][];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream out = new BufferedOutputStream(System.out);
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());

        db = new int[n][n];
        char message[][] = new char[n][n];
        boolean check[][] = new boolean[n][n];

        for(int i=0;i<n;i++){
            String line = br.readLine();
            for(int j=0;j<n;j++){
                check[i][j] = false;
                if(line.charAt(j) == '.') db[i][j]=1;
                else db[i][j] = 0;
            }
        }

        String encrypted = br.readLine();

        boolean done = true;

        int iter = 4;
        int curIndex = 0;
        while(iter-->0 && done){
            for(int i=0; i<n && done;i++){
                for(int j=0;j<n;j++){
                    if(db[i][j] == 1){
                        if(curIndex>=n*n){
                            done = false;
                            break;
                        }
                        message[i][j] = encrypted.charAt(curIndex++);
                        check[i][j] = true;
                    }
                }
            }
            rotate(n);
        }
        for(int i=0;i<n && done;i++){
            for(int j=0;j<n;j++){
                if(!check[i][j]){
                    done = false;
                    break;
                }else sb.append(message[i][j]);
            }
        }

        if(!done){
            sb = new StringBuilder();
            sb.append("invalid grille");
        }

        out.write(sb.toString().getBytes());
      
        br.close();
        out.close();
    }

    static void rotate(int N){

    for (int i = 0; i < N / 2; i++)
    {
        for (int j = i; j < N - i - 1; j++)
        {
 
            // Swap elements of each cycle
            // in clockwise direction
            int temp = db[i][j];
            db[i][j] = db[N - 1 - j][i];
            db[N - 1 - j][i] = db[N - 1 - i][N - 1 - j];
            db[N - 1 - i][N - 1 - j] = db[j][N - 1 - i];
            db[j][N - 1 - i] = temp;
        }
    }
    }
}
