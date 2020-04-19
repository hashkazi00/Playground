#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,td,tc;
  int temp;
  cin>>a>>b>>c>>d;
  td=a+c;
  tc=b+d;
  while(tc>=100)
  {
    tc=tc%100;
    td+=1;
  }
  cout<<td<<"\n"<<tc;
}