#include <iostream>
using namespace std;
int main() 
{
    int n,t;
    cin>>n;
    while(n>0){
      t=n%10;
      n=n/10;
      cout<<t;
      
    }
	return 0;
}