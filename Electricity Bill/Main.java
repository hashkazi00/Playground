#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  if(x<=200)
  {
    cout<<"Rs."<<int(x*0.5);
  }
  else if(x<=400)
  {
    cout<<"Rs."<<x*0.65+100;
  }
  else if(x<=600)
  {
    cout<<"Rs."<<x*0.80+200;
  }
  else
  {
    cout<<"Rs."<<x*1.25+475;
  }
}