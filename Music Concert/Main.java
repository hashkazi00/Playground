#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int x,m=0,f=0;
  cin>>x;
  int *a;
  a=(int*)calloc(x,sizeof(int));
  for(int i=0;i<x;i++){
    cin>>*(a+i);
  }
  for(int i=0;i<x;i++){
    if(*(a+i)%2==0){
      m++;
    }
    else{
    f++;
    }
  }
  cout<<f<<"\n"<<m;
  return 0;
}