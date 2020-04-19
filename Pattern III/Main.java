#include<iostream>
#include<cstdio>
using namespace std;
int main(){
  int x;
  cin>>x;
  for(int i=1;i<=x;i++){
    for(int j=1;j<=i;j++){
      if(j<i){
        cout<<i<<"*";
      }
      else{
        cout<<i;
      }
    }
    cout<<"\n";
  }
  for(int i=x;i>=1;i--){
    for(int j=1;j<=i;j++){
      if(j<i){
        cout<<i<<"*";
      }
      else{
        cout<<i;
      }
    }
    cout<<"\n";
  }
}