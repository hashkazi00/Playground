#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    int tb,to,rs,dec;
    float tr,rrr,bb,crr,bo,flo;
    cin>>tb;
    to=tb/6;
    cin>>tr;
    rrr=tr/to;
    cin>>rs>>bb;
    flo=bb/6;
    dec=bb/6;
    flo=flo-dec;
    bo=dec+(flo*6*0.1);
    crr=rs/bo;
    cout<<to<<"\n"<<bo<<"\n";
    printf("%0.1f\n",crr);
    printf("%0.1f\n",rrr);
    (crr>rrr)?cout<<"Eligible to Win":cout<<"Not Eligible to Win";
}