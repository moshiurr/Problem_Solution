#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n, prevMax=0,t,count=0;
    cin>>n;
    vector<int> vec;
        
        for(int i=0; i<n; i++){
            cin>>t;
            if(t>prevMax){
                vec.push_back(t);
                prevMax = t;
                count++;
            } 
        }
        
        cout<<count<<endl;
        
        for(auto it = vec.begin(); it != vec.end(); it++){
            cout<<*it<<" ";
        }
}
