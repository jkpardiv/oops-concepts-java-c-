#include<iostream>
using namespace std;

class Student{
    public:
    virtual void prepare()=0;
    void enjoy();
};
class Sem:public Student{
    public:
    void prepare(){
        cout<<"Students prepare for sem"<<endl;
    }
    void enjoy(){
        cout<<"Some students enjoy during mid"<<endl;
    }
};
class mid : public Student{
    public:
    void prepare(){
        cout<<"Students won't prepare seriously for mid"<<endl;
    }
    void enjoy(){
        cout<<"No student enjoys before sem"<<endl;
    }
};
int main(){
    mid k;
    k.prepare();
    k.enjoy();
    Sem a;
    a.prepare();
    a.enjoy();
}