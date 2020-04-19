#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  if(z>x & z<= 2*x)
  {
    cout<<"It is a mango tree";
  }
  else if(z<=(x*x-x) & z>=(x*x-(2*x)))
     {
       cout<<"It is a mango tree";
     }
  else
  {
    cout<<"It is not a mango tree";
  }
}
