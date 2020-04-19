#include<iostream>
int main()
{
  int x,y,z;
  int a;
  std::cin>>x>>y>>z;
  a=(y*75)+(z*30);
  if(a>x)
  {
    std::cout<<"Boat will drow";
  }
  else
  {
    std::cout<<"Boat is stable";
  }
  
}