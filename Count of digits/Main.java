#include<iostream>
using namespace std;
int main()
{
  int n,i=0,t=0;
  cin>>n;
  do
  {
    t=n%10;
    n=n/10;
     i++;
  }while(n>0);
  cout<<i;
}