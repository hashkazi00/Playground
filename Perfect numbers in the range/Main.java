#include<iostream>
using namespace std;
int main()
{
  int x,y,temp,c=0;
  cin>>x>>y;
  for(int j=x;j<y;j++){
    temp=0;
    for(int i=1;i<j;i++)
    {
      if(j%i==0)
      {
        temp+=i;
      }

    }
    if(temp==j)
    {
      cout<<j<<" ";
    }
  }
}