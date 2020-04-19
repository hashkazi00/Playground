#include<iostream>
using namespace std;
int main()
{
  float x=0.50,i;
  float y;
  cin>>y;
  if(y>1)
  {
    cout<<x<<" ";
    for(i=2; i<=y; i++)
    {
      x*=3;
      cout<<x<<" ";
    }
  }
  else
  {
    cout<<x;
  }
}