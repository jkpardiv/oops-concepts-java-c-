#include<iostream>
using namespace std;
class Animal{
    public:
    void eat(){
        cout<<"Animals can eat"<<endl;
    }
};
//single level inheritance//
class Dog: public Animal{
    public:
    void bark(){
        cout<<"Dogs barks "<<endl;
    }
};
//multi level inheritance//
class puppy: public Dog{
    public:
    void sleep(){
        cout<<"Puppys can sleep"<<endl;
    }
};
//hierarchial inheritance since this is the second derived class from the same base class//
class Lion : public Animal{
    public:
    void roar(){
        cout<<"Lions roars"<<endl;
    }
};
int main(){
    Dog k;
    puppy l;
    Lion m;
    cout<<"Single level inheritance"<<endl;
    k.bark();
    k.eat();
    cout<<"multi level inheritance"<<endl;
    l.bark();
    l.eat();
    l.sleep();
    cout<<"Hierarchial inheritance"<<endl;
    m.roar();
    m.eat();
}


