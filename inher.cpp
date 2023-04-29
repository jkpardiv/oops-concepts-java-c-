#include<iostream>
using namespace std;
class shape{
    protected:
    int width,height;
    public:
    void setwidth(int x){
        width=x;
    }
    void setheight(int y){
        height=y;
    }
};
class rectangle:public shape{
    public:
    int getArea(){
        return (width*height);
    }
};
int main(){
    rectangle k;
    k.setwidth(5);
    k.setheight(7);
    cout<<"area is :"<<k.getArea()<<endl;
}