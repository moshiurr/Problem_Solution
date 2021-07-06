#include <bits/stdc++.h>

using namespace std;

class Pair {
    public:
    int x;
    int y;
    int dis;
    Pair(int r,int c,int z) : x(r), y(c), dis(z)
    {
    }
};

int shortestPath(int **db, bool **visited, int fx, int fy){
    queue<Pair> q;
        q.push(Pair(0,0,0));
        visited[0][0] = true;
        
        while(!q.empty()){
            Pair p = q.front();
            q.pop();
            if(p.x == fx && p.y == fy) return p.dis;

            int jump = db[p.x][p.y];
            
            //down
            if (p.x + jump <= fx && visited[p.x + jump][p.y] == false){
                q.push(Pair(p.x+jump,p.y,p.dis+1));
                visited[p.x+jump][p.y] = true;
            }
            
            //right
            if (p.y + jump <= fy && visited[p.x][p.y+jump] == false){
                q.push(Pair(p.x,p.y+jump,p.dis+1));
                visited[p.x][p.y+jump] = true;
            }
            
            //left
            if (p.y - jump >=0 && visited[p.x][p.y-jump] == false){
                q.push(Pair(p.x,p.y-jump,p.dis+1));
                visited[p.x][p.y-jump] = true;
            }
            
            //up
            if (p.x - jump >= 0 && visited[p.x - jump][p.y] == false){
                q.push(Pair(p.x-jump,p.y,p.dis+1));
                visited[p.x-jump][p.y] = true;
            }

        }
        return -1;
}

int main() {
    int ROW, COL;
    cin>>ROW>>COL;
    string s;
    getline(cin,s);
    
    int** db = new int*[ROW];
    bool** visited = new bool*[ROW];
    
    for(int i=0; i<ROW;i++){
        db[i] = new int[COL];
        visited[i] = new bool[COL];
        string in;
        getline(cin,in);
        for(int j=0; j<COL; j++){
            db[i][j] = in[j] - '0';
            visited[i][j]=false;
        }
    }
    
    cout<<shortestPath(db,visited,ROW-1,COL-1);
}
