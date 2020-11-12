#include <stdio.h>
#include <iostream>
#include <set>
#define yes cout<<"YES"<<endl
#define no cout<<"NO"<<endl
#define ll long long int
 
using namespace std;
 
void solve(){
    ll a,b;
    cin>>a>>b;
 
    if(a%b == 0){
        cout<<0<<endl;
    }else{
        ll x,y;
        x = a/b;
        y = x+1;
        y = y * b;
        cout<<y-a<<endl;
    }
}
 
int main(){
    ll t;
    cin>>t;
 
    while(t--){
        solve();
    }
}
