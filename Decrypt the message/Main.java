#include<iostream>
using namespace std;
int main()
{
  int x,y,z,temp=0;
  cin>>x>>y;
  z=x+y;
  for(int i=1;i<=z-1;i++)
    {
      if(z%i==0)
      {
        temp+=i;
      }
  }
  if(temp==z)
  {
    cout<<"They can read the message";
  }
  else
  {
    cout<<"They can't read the message";
  }
}