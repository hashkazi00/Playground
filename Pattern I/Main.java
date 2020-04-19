#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x;
for(int i=1;i<=4;i++)
    {
      for(int j=1;j<=i;j++)
      {
        cout<<x;
      }
      cout<<"\n";
      x++;
    }
  y=x-1;
  for(int k=4;k>=1;k--)
  {
    for(int l=1;l<=k;l++)
    {
    cout<<y;
    
    }
    cout<<"\n";
    y--;
  }
}