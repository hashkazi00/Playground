#include<iostream>
using namespace std;
int main()
{
  int x,y=11;
  cin>>x;
  if(x>=1)
  {
    for(int i=1;i<=x;i++)
    {
      cout<<y*y<<" ";
      y=y+4;
    }
  }
}