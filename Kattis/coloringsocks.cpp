#include <bits/stdc++.h>

using namespace std;

int main() {
    long long int s, size,color_diff,prevSock,t,ans=0,rem=0;
    cin>>s>>size>>color_diff;
    
    vector<long long int> vec;

    for(int i=0; i<s;i++){
        cin>>t;
        vec.push_back(t);
    }

    sort(vec.begin(), vec.end());
    
    ans++;
    rem=size-1;
    prevSock = vec[0];

    for(int i=1; i<s; i++){
        if(rem == 0){
            ans++;
            prevSock = vec[i];
            rem=size;
        }
        if(vec[i]-prevSock > color_diff){
            ans++;
            rem=size;
            prevSock=vec[i];
        }
        rem--;
    }
    cout<<ans;
