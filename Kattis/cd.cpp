#include<bits/stdc++.h>

using namespace std;

typedef long long ll;
typedef long long int lli;
typedef unsigned long long int ulli;


int main() {
    long long m,n;
    cin>>m>>n;
    
    while(n && m){
        unordered_set<lli> db;
        lli temp;

        for (int i = 0; i <m; i++) {
            cin >> temp;
            db.insert(temp);
        }
        
        lli ans = 0;
        lli size = db.size();
    
        for(int i=0; i<n; i++){
            cin>>temp;
            db.insert(temp);
            if(db.size() == size) ans++;
            else size++;
        }
        
        cout<<ans<<endl;
        cin>>m>>n;
    }
}
