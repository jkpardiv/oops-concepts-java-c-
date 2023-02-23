#include<iostream>
using namespace std;
class Student{
    public:
    string fullname;
    double semPercentage;
    string collegeName;
    int collegeCode;
    Student(){
        collegeName = "MVGR";
        collegeCode=33;
    }
    Student(Student &s){
        cout<<"enter full name:"<<endl;
        getline(cin,s.fullname);
        cout<<"enter your sem percentage"<<endl;
        cin>>s.semPercentage;
    }
    ~Student(){
        cout<<"It is destructor"<<endl;
    }
    void display(){
        cout << "Full Name : " << fullname << endl;
        cout << "Sem Percentage : " << semPercentage << endl;
        cout << "College Name : " << collegeName << endl;
        cout << "College Code : " << collegeCode << endl;
    }
};
int main(){
    Student s1;
    Student s2=s1;
    cout<<"----STUDENT DETAILS-----"<<endl;
    s1.display();
}