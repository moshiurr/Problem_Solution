///////////////////////////////////////////////////////////////////////////////////////
//     Author : Moshiur Rahman                                                       //
///////////////////////////////////////////////////////////////////////////////////////
 
#include <iostream>
#include <set>
#include <map>
#include <string>
#include <cmath>

 
using namespace std;
 
#define yes cout<<"YES"<<endl
#define no cout<<"NO"<<endl
#define ln <<endl
#define nl cout<<endl


#define min(a,b) ((a)<(b)?(a):(b))
#define max(a,b) ((a)>(b)?(a):(b))

typedef long long int ll;

void solve(){
   ll i,sum=0,avg;
   int counter=0;
   cin>>i;
   double total = (double)i;
   int a [i];
   for(int j=0;j<i;j++){
       int n;
       cin>>n;
       a[j]=n;
       sum+=n;
   }
   avg = sum/total;
   for(int j=0;j<total;j++){
       if(a[j]>avg){
           counter++;
       } 
   }
   double ans = (counter/total)*100;
   ans = round(ans * 1000.0)/1000.0;
//    int temp = (int)(ans*1000.0);
//    ans = ((double)temp/1000.0);
   printf("%.3f",ans);
   cout<<"%" ln;

}
int main(){
        ll t;
        cin>>t;
        while(t--){
            solve();
        }
}
