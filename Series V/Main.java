#include<iostream>
using namespace std;
int main()
{
  int x,y=11,z=0;
  cin>>x;
  while(x>=1)
  {
    z=y*y;
    cout<<z<<" ";
    y+=4;
    x--;
  }
}