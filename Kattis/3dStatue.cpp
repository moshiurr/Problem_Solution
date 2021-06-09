#include <iostream>
#include <math.h>
using namespace std;

int main() {
    int n,power=0;;
     cin>>n;
     
     bool done =false;
     for(int i=0; i<=n/2;i++){
         int p = pow(2,i);
         if(p == n){
             cout<<i+1;
             done = true;
             break;
         }
         
         if(p < n) power = i;
         else if(p > n) break;
     }
     
     if(!done) cout<<power+2;
    
    
}
