#include<iostream>
using namespace std;
class Parent{
    public:
    int x=1;
    protected:
    int y=2;
    private:
    int z=3;
   
};
class Child:public Parent{
    public:
    int gety(){
        return y;
    }
};
class child1: protected Parent{
    public:
    int gety(){
        return y;
    }
    int getx(){
        return x;
    }
};
class child2: private Parent{
    public:
    int getx(){
        return x;
    }
    int gety(){
        return y;
    }
};

int main(){
    Child obj1;
    child1 obj2;
    child2 obj3;
    cout<<"public inheritance"<<endl;
    cout<<"X:"<<obj1.x<<endl;
    cout<<"Y:"<<obj1.gety()<<endl;
    cout<<"protected inheritance"<<endl;
    cout<<"X:"<<obj2.getx()<<endl;
    cout<<"Y:"<<obj2.gety()<<endl;
    cout<<"private inheritance"<<endl;
    cout<<"X:"<<obj3.getx()<<endl;
    cout<<"Y:"<<obj3.gety()<<endl;
}
