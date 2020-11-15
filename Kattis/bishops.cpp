
#include <iostream>
#include <set>
#include <map>
#include <string>
#include<vector>
using namespace std;
 
#define yes cout<<YES<<endl
#define no cout<<NO<<endl
#define ln <<endl
#define nl cout<<endl

//sort(array,array length, optional(greater<int>()));


#define min(a,b) ((a)<(b)?(a):(b))
#define max(a,b) ((a)>(b)?(a):(b))

typedef long long ll;
typedef long long int lli;
typedef unsigned long long int ulli;


int main(){
   lli n;
   while(cin>>n){
       if(n == 1) cout<<1 ln;
       else  cout<<((n - 2) * 2) + 2 ln;
   }
}

