#include<iostream>
using namespace std;
class father{
    public:
    void son(){
        cout<<"he is my son"<<endl;
    }
};
class mother{
    public:
    void son(){
        cout<<"he is my Son"<<endl;
    }
};
class child :public mother,public father{
    public:
    void gf(){
        cout<<"I'm yours"<<endl;
    }
};
int main(){
    child k;
    k.son();
    k.gf();
}
