///////////////////////////////////////////////////////////////////////////////////////
//     Author : Moshiur Rahman                                                       //
///////////////////////////////////////////////////////////////////////////////////////
 
#include <iostream>
#include <set>
#include <map>
#include <string>
 
using namespace std;
 
#define yes cout<<"YES"<<endl
#define no cout<<"NO"<<endl
#define ln <<endl
#define nl cout<<endl


#define min(a,b) ((a)<(b)?(a):(b))
#define max(a,b) ((a)>(b)?(a):(b))

typedef long long int ll;

void solve(){
    ll a,b,c,A,B,C;
    cin>>a>>b>>c;
    string s;
    cin>>s;
    A = min(min(a,b),c);
    C = max(max(a,b),c);
    B = a+b+c-A-C;
     for(char& c : s){
         if(c == 'A') cout<<A<<" ";
         else if(c == 'B') cout<<B<<" ";
         else cout<<C<<" ";
     }
     nl;

}

int main(){
        solve();
}
