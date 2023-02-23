#include<iostream>
using namespace std;
class Box{
    public:
    float l,b,h;
    void boxArea(){
        cout<<"box area is:"<< (2*(l*b+b*h+h*l))<<endl;
    }
    void boxVolume();
    friend void display(Box &b);
    inline void displaymsg(){
    cout<<"welcome"<<endl;
}
};
void Box::boxVolume()
{
    cout<<"Box area is:"<<(l*b*h)<<endl;
}
void display(Box &b1){
    cout<<"box length:"<<b1.l<<endl;
    cout<<"box width :"<<b1.b<<endl;
    cout<<"box height:"<<b1.h<<endl;
}
int main(){
    Box g;
    cout<<"enter box length:"<<endl;
    cin>>g.l;
    cout<<"enter box width:"<<endl;
    cin>>g.b;
    cout<<"enter box height:"<<endl;
    cin>>g.h;
    g.boxArea();
    g.boxVolume();
    display(g);
    g.displaymsg();
}