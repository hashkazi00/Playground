#include <iostream>
using namespace std;
int satisfied(int,int,int);
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  int w=satisfied(x,y,z);
  if(w)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}

int satisfied(int a, int b, int c)
{
  int is_true=0,exp=1;
  for(int i=1;i<=b;i++)
  {
    exp*=a;
  }
  if(c<=exp)
  {
    is_true=1;
    return is_true;
  }
  else
  {
    is_true=0;
    return is_true;
  }
}