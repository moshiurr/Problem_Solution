///////////////////////////////////////////////////////////////////////////////////////
//     Author : Moshiur Rahman                                                       //
///////////////////////////////////////////////////////////////////////////////////////
 
#include <iostream>
#include <bits/stdc++.h>
#include <set>
#include <map>
#include <string>
 
using namespace std;
 
#define yes cout<<"YES"<<endl
#define no cout<<"NO"<<endl
#define ln <<endl
#define nl cout<<endl
typedef long long int ll;
 
void solve(){
    ll n,a,evenSum=0,oddSum=0;
    cin>>n;
    if(n%2 == 1 || (n/2)%2 == 1) {
        no;
    }else{
        yes;
        a=2;
        for(int i=0;i<n/2;i++){
            evenSum+=a;
            cout<<a<<" ";
            a+=2;
        }
        a=1;
        for(int i=0; i<(n/2)-1;i++){
            oddSum+=a;
            cout<<a<<" ";
            a+=2;
        }
        while((oddSum+a) != evenSum){
            a+=2;
        }
        cout<<a<<" ";
        nl;
    }
}
 
int main()
{
    int t;
    cin>>t;
    while(t--){
        solve();
    }
}
