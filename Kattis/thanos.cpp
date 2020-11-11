#include <iostream>
#include <set>
#include <map>
#include <string>
#include<vector>
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

int main(){
    lli t;
    cin>>t;
    while(t--){
        lli p,r,f;
        cin>>p>>r>>f;
        lli count = 0;
        while(p<=f){
            p*=r;
            count++;
        }
        cout<<count ln;
    }
}
