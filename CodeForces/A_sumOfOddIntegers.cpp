#include <stdio.h>
#include <iostream>
#include <set>
#define yes cout<<"YES"<<endl
#define no cout<<"NO"<<endl
#define ll long long int
 
using namespace std;
 
 
int main(){
    ll t,x,y;
    cin>>t;
    while(t--){
        cin>>x>>y;
        if(x>=(y*y) && (x%2 == y%2)) yes;
        else no;
    }
}
