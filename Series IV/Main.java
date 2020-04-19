#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x;
  if(x>=1)
  {
    for(int i=1;i<=x;i++)
    {
      if(i%2!=0)
      {
      	y=(i*i)-1;
      	cout<<y<<" ";
        }
      else if(i%2==0)
      {
        y=(i*i)-2;
        cout<<y<<" ";
      }
    }
  }
}