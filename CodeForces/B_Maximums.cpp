
#include <iostream>
using namespace std;
 
int main(){
    int n;
    cin>> n;
    int m=0;
    int p = 0;
    for(int i=0;i<n;++i){
        int k;
        cin >> k;
        m+=k;
        if(p < 0) m-=p;
 
        if(k<0){
            p = k;
        }else
        {
            p = 0;
        }
 
        cout<<m<<" ";
    }
}
