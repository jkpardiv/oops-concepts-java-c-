#include<iostream>
#include "boxVolume.h"
using namespace std;
int main()
{
    int x,y,z;
    cout<<"enter length and width and height: "<<endl;
    cin>>x>>y>>z;
    cout<<"area is :"<<boxArea(x,y)<<endl;
    cout<<"volume is:"<<boxVolume(x,y,z)<<endl;
}