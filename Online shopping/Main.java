#include<iostream>
using namespace std;
int main()
{
  int x1,x2,x3,y1,y2,y3,z1,z2,z3;
  float f,s,a;
  cin>>x1>>x2>>x3>>y1>>y2>>y3>>z1>>z2>>z3;
  f= x1*(1-x2*0.01)+x3;
  s= y1*(1-y2*0.01)+y3;
  a= z1*(1-z2*0.01)+z3;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  if(f>s) 
  {
    if(a>s)
    {
    	cout<<"He will prefer Snapdeal";
    }
  }
  
  if(s>=f) 
  {
    if(a>f)
    {
    	cout<<"He will prefer Flipkart";
    }
  }
  if(f>a) 
  {
    if(s>a)
    {
    	cout<<"He will prefer Amazon";
    }
  }
  
  
  
  
}