#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  if(x>y)
  {
    cout<<(100+y)-x;
  }
  else
  {
    cout<<y-x;
  }
}