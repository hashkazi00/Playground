#include<iostream>
using namespace std;
int main()
{
  int n,x=0,y=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
    if(arr[i]%2==0){
      x+=arr[i];
    }
    else{
      y+=arr[i];
    }
    
  }
  cout<<"The sum of the even numbers in the array is "<<x<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<y;
}