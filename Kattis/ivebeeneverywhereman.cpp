#include <iostream>
#include <iterator>
#include <set>
#include <string>
 
using namespace std;
 
int main()
{   
    int t,n;
    cin>>t;
    while(t--){
        cin>>n;
        set<string> s;
        while(n--){
            string word;
            cin>>word;
            s.insert(word);
        }
        cout<<s.size()<<endl;
    }
    return 0;
}
