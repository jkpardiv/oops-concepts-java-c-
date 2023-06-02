#include<iostream>
using namespace std;
   
template<typename A>
A my(A a,A b){
    return a+b;
}
int main(){
    cout<<my<int>(4,5)<<endl;
    cout<<my<string>("koushik","pardiv");
}