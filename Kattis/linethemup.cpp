#include <bits/stdc++.h>

using namespace std;

#define yes cout<<"YES"<<endl
#define no cout<<"NO"<<endl
#define ln <<endl
#define nl cout<<endl

//sort(array,array length, optional(greater<int>()));


#define min(a,b) ((a)<(b)?(a):(b))
#define max(a,b) ((a)>(b)?(a):(b))

typedef long long ll;
typedef long long int lli;
typedef unsigned long long int ulli;

int main() {
    lli n;
    cin>>n;
    string a,b;
    cin>>a>>b;
    //true - increasing ; false - decreasing
    bool condition = (a<b) ? true : false;
    bool notDone = false;
    
    for(int i=2; i<n;i++){
        string temp;
        cin>>temp;
        if(b<temp && condition) continue;
        else if(b>temp && !condition) continue;
        else {
            notDone = true;
            break;
        }
    }
    
    if(notDone) cout<<"NEITHER" ln;
    else if(condition) cout<<"INCREASING" ln;
    else cout<<"DECREASING" ln;
}
