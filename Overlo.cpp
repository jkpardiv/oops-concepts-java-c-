#include<iostream>
using namespace std;


void add(int a,int b){
    cout<<"sum ="<<(a+b)<<endl;
}
void add(int x,int y,int z){
    cout<<"Sum ="<<(x+y+z)<<endl;
}
void add(double a,double k){
    cout<<"sum ="<<(a+k)<<endl;
}
void add(int a,double b){
    cout<<"Sum ="<<(a+b)<<endl;
}
int main(){
    add(1,2);
    add(1,2,5);
    add(2.4,4.2);
    add(1,3.5);
}