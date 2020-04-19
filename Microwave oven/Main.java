#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  int x;
  float y;
  cin>>x>>y;
  if(x==1)
  {
    printf("%0.2f",y);
  }
  else if(x==2)
  {
    printf("%0.2f",y+(y*0.5));
  }
  else if(x==3)
  {
    printf("%0.2f",y+y);
  }
  else
  {
    printf("Number of items is more");
  }
  
  
  
}