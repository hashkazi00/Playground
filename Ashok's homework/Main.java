#include<iostream>
using namespace std;
int main()
{
  int x,y;
  cin>>x>>y;
  int arr[x][y],arr2[x][y],arr3[x][y];
  for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
      cin>>arr[i][j];
    }
  }
  
 for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
      cin>>arr2[i][j];
    }
  }
  
  for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
      arr3[i][j]=arr[i][j]+arr2[i][j];
      cout<<arr3[i][j]<<" ";
    }
    cout<<"\n";
  }
  
  
}