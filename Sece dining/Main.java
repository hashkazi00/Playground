#include<iostream>
using namespace std;
int main()
{
  string c;
  int x;
  cin>>c>>x;
  if(c=="front")
  {
    if(x==1){
      cout<<"Left Handed";
    }
    else {
      cout<<"Right Handed";
    }
  }
  
  else if(c=="rear")
  {
    if(x==1)
    {
    cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
  
}