#include <iostream>
using namespace std;
#include<cstdio>
int swasp(int &a,int &b)
{
  int temp;
  temp=a;
  a=b;
  b=temp;
}

int main()
{
  int x,y;
  cin>>x>>y;
  printf("Before swapping a= %d and b=%d\n",x,y);
  swasp(x,y);
  printf("After swapping a= %d and b=%d\n",x,y);
}