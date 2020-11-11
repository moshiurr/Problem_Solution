///////////////////////////////////////////////////////////////////////////////////////
//     Author : Moshiur Rahman                                                       //
///////////////////////////////////////////////////////////////////////////////////////
 
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

typedef long long int ll;

int main()
{
    int n;
    cin>>n;
    int factors = 0;
    int factor = 2;
    while (factor*factor <= n)
    {
        if (n % factor == 0)
        {
            n /= factor;
            factors++;
        }else{
            factor++;
        }
    }
    cout<<factors+1 ln;
}
