#include<iostream>
#include<cstdio>
using namespace std;
int pow(int a,int n)
{
  if(n==0)
  {
    return 1;
  }
  return a*pow(a,n-1);
  
}
int main()
{
  //Type your code here.
  int x,y,n;
  cout<<"Enter the value of a \n";
  cin>>x;
  cout<<"Enter the value of n \n";
  cin>>y;
  n=pow(x,y);
  printf("The value of %d power %d is %d",x,y,n);
  return 0;
}