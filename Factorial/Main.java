#include<iostream>
#include<cstdio>
using namespace std;
int fact(int n)
{
  if(n==1)
  {
    return 1;
  }
  return n*fact(n-1);
}
int main()
{
  int x;
  cin>>x;
  int n=fact(x);
  printf("The factorial of %d is %d",x,n);
}