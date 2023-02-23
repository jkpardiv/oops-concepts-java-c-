#include<iostream>
using namespace std;
class Student{
    string fullname;
    int rollNum;
    double semPercentage;
    string collegeName;
    int collegeCode;
    public:
    Student(string x,int r,double s,string c,int y){
        fullname=x;
        rollNum=r;
        semPercentage=s;
        collegeName=c;
        collegeCode=y;
    }
    ~Student(){
        cout<<"It is destructor"<<endl;
    }
    void display(){
        cout << "Full Name : " << fullname << endl;
        cout << "Roll number : " << rollNum << endl;
        cout << "Sem Percentage : " << semPercentage << endl;
        cout << "College Name : " << collegeName << endl;
        cout << "College Code : " << collegeCode << endl;
    }
};
int main(){
    Student s1=Student("kp",570,8.5,"mvgr",0);
    cout<<"----STUDENT DETAILS-----"<<endl;
    s1.display();
}