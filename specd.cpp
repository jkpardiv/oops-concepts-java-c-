#include<iostream>
using namespace std;
class AccessSpecifierDemo{
    private:
     int privar;
    protected:
      int proVar;
    public :
     int pubVar;
    public:
    void setVar(int priValue,int proValue, int pubValue){
        privar=priValue;
        proVar=proValue;
        pubVar=pubValue;
    }
    public:
    void getVar(){
        cout<<"private variable: "<<privar<<endl;
        cout<<"protected variable: "<<proVar<<endl;
        cout<<"private variable: "<<pubVar<<endl;
    }
};
int main(){
    AccessSpecifierDemo k;
    k.setVar(4,5,6);
    k.getVar();
}