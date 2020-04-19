#include<iostream>
#include<cstdio>
using namespace std;
int fib(int a) 
{ 
    if (a ==1 || a==0) 
        return a; 
    return fib(a-1) + fib(a-2); 
}

int main()
{
  int x,n;
  cin>>x;
  n=fib(x-1);
  printf("The term %d in the fibonacci series is %d",x,n);
  return 0;
}