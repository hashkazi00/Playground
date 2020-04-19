#include<iostream>
using namespace std;
int main()
{
  int x,y,z,i,temp=0;
  cin>>x>>y>>z;
  if(x<y && x<z)
  {
    if(y<z)
    {
      cout<<"The treasure is in box which has number "<<y<<"\n";
    }
    else
    {
      cout<<"The treasure is in box which has number "<<z<<"\n";
    }
    i=x;
    for(int j=1;j<=i;j++)
    {
      if(y%j==0 && z%j==0)
      {
        temp=j;
      }
    }
      
  }
  else if(y<x && y<z)
  {
    if(x<z)
    {
      cout<<"The treasure is in box which has number "<<x<<"\n";
    }
    else
    {
      cout<<"The treasure is in box which has number "<<z<<"\n";
    }
    i=y;
    for(int j=1;j<=i;j++)
    {
      if(x%j==0 && z%j==0)
      {
        temp=j;
      }
    }
  }
  else
  {
    if(x<y)
    {
      cout<<"The treasure is box which has number "<<x<<"\n";
    }
    else
    {
      cout<<"The treasure is in box which has number "<<y<<"\n";
    }
    i=z;
    for(int j=1;j<=i;j++)
    {
      if(x%j==0 && y%j==0)
      {
        temp=j;
      }
    }
  }
  cout<<"The code to open the box is "<<temp;
  
}