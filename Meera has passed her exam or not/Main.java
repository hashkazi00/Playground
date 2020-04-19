#include<iostream>
using namespace std;
 

int main()
{
  int n,r,temp=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>r;
  for(int j=0;j<n;j++){
      if(arr[j]==r){
        temp=1;
        break;
      }
      else{
        temp=0;
      }   
    }
  
  if(temp==1){
    cout<<"She passed her exam";
  }
  else{
    cout<<"She failed";
  }
  }