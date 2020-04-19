#include<iostream>
using namespace std;
int gcd(int a,int b, int c)
{
  int hcf,st;
  st=a<b?(a<c?a:c):(b<c?b:c);
  for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
   return hcf;
  
}

int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  if(d==gcd(a,b,c))
  {
    cout<<"Answer is correct.";
  }
  else
  {
  	cout<<"Answer is wrong.";
  }
}
