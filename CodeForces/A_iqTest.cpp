#include <iostream>
using namespace std;
 
int main(){
    int n;
    cin>> n;
    
    int prev = 0;
    for(int i=1; i<=n;++i){
        int current;
        cin>> current;
        
        if((prev%2 == 0 && current%2==0) || (prev%2 != 0 && current%2 != 0) || prev == 0) prev = current;
        else{
            if(i == n){
                cout<<i;
                break;
            }else{
                int next;
                cin>> next;
                if((next%2 == 0 && current%2 == 0) || (next%2 != 0 && current%2 !=0)){
                cout<<i-1;
                }else{
                cout<<i;
                }
            }
            break;
        }
 
    }
 
}
