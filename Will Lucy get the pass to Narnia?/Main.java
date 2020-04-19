#include<iostream>
int main()
{
  int x,y,z;
  std::cin>>x;
  std::cin>>y;
  std::cout<<"Enter first number : ";
  std::cout<<"Enter second number : ";
  std::cout<<"Menu"<<"\n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"
  <<"\n"<<"4.Division"<<"\n"<<"5.Remainder";
  std::cin>>z;
  switch (z){
    case 1:
      std::cout<<"\n"<<x+y;
      break;
  	case 2:
      std::cout<<"\n"<<x-y;
      break;
    case 3:
      std::cout<<"\n"<<x*y;
      break;
    case 4:
      std::cout<<"\n"<<x/y;
      break;
    case 5:
      std::cout<<"\n"<<x%y;
      break;
    default:
      std::cout<<"\n"<<"Invalid operation";
  }
  
}