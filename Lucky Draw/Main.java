#include<iostream>
using namespace std;
int main()
{
  int x,flag=0;
  cin>>x;
  if (x>1)
  {
    for(int i=2;i<x;i++)
    {
      if(x%i==0)
      {
        cout<<"Not eligible"; 
        flag=1;
        break;
      }
    }
    if(flag==0)
    {
      cout<<"Eligible";
    }
  }
  else
  {
    cout<<"Not eligible";
  }
}