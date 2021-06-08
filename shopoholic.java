#include <bits/stdc++.h>

using namespace std;

int main() {
    long long int n,p, ans=0;
    
    vector<long long int> vec;
    
    cin>>n;

    for(int i=0; i<n;i++){
        cin>>p;
        vec.push_back(p);
    }

    sort(vec.begin(), vec.end());
    
    int count = 1;
    for(int i=n-1; i>=0; i--){
        if(count%3 == 0) ans+=vec[i];
        count++;
    }
    
    cout<<ans;
    
}
