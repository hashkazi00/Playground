#include<iostream>
int main(){
  int x;
  int fact=1;
  std::cin>>x;
  if(x==0)
  {
    std::cout<<fact;
  }
  else
  {
    for(int i=1;i<=x;i++)
    {
      fact*=i;
    }
    std::cout<<fact;
  }
  
}