#include<iostream>
using namespace std;
int main()
{
  int x,temp=0;
  cin>>x;
  for(int i=1;i<=x-1;i++)
  {
    for(int j=1;j<=i;j++)
    {
      temp+=1;
    }
  }
  cout<<temp;
}