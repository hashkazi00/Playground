#include<iostream>
using namespace std;
int main()
{
  int p,i,n;
  int ia,ta;
  float d,fs;
  cin>>p>>i>>n;
  ia=p*n*(i*0.01);
  ta=ia+p;
  d=ia*0.02;
  fs=ta-d;
  cout<<ia<<"\n"<<ta<<"\n"<<d<<"\n"<<fs;
  
  
  
}