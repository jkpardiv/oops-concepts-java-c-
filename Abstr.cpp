#include<iostream>
using namespace std;

class Student{
    public:
    virtual void prepare()=0;
};
class Sem:public Student{
    public:
    void prepare(){
        cout<<"Students prepare for sem"<<endl;
    }
};
class mid : public Student{
    public:
    void prepare(){
        cout<<"Students won't prepare seriously for mid"<<endl;
    }
};
int main(){
    mid k;
    k.prepare();
    Sem a;
    a.prepare();
}