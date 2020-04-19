
#include<iostream>
#include<cstdio>
using namespace std;

int main()
{
    int n, m, res;
    cin >> n >> m;
    if(n < m)
    {
        res = n;
    }
    else
    {
        res = m;
    }
    if(res % 2 == 0)
    {
        printf("Mani Iyer");
    }
    else
    {
        printf("Arun Gupta");
    }
    return 0;
}