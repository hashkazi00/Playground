#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int x;
  float y;
  cin>>x>>y;
  if(y==10.15f)
  {
    if(x<13)
    {
      printf("$4.00");
    }
    if(x>13)
    {
      printf("$8.00");
    }
  }
   if(y==13.30f)
  {
    if(x<13)
    {
      printf("$2.00");
    }
    if(x>13)
    {
      printf("$5.00");
    }
  }
  
  
}  