#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  int c=x%10;
  int d=(x/1000);
  std::cout<<c+d;
}