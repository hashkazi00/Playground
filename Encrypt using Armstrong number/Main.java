#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n){
    int c=0,temp,expo=1,arms=0,is_arm=0;
    int t=n,l=n;
while(t>0)
  {
    temp=t%10;
    c+=1;
    t=t/10;
  }
  
  temp=0;
  
while(l>0)
  {
    temp=l%10;
    for(int q=1;q<=c;q++)
    {
      expo*=temp;
    }
    arms+=expo;
    expo=1;
    l=l/10;
  }
if(arms==n)
  {
    is_arm=1;
  }
  else{
    is_arm=0;
  }
  return is_arm;
}

int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}