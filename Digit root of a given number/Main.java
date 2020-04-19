using namespace std; 
#include<iostream>
int digSum(int n) 
{ 
    if (n == 0)  
       return 0; 
    return (n % 9 == 0) ? 9 : (n % 9); 
} 
  
int main() 
{ 
    int n;
    cin>>n;
    cout<<digSum(n); 
    return 0; 
}