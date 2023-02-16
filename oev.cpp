#include<iostream>
using namespace std;
void oddoreven(int);
int main()
{
	int n;
	cout<<"enter a number :";
	cin>>n;
	oddoreven(n);
}
void oddoreven(int n){
if(int(n)%2==0){
cout<<"It is even number "<<endl;
}
else{ cout<<"It is odd number "<<endl;
}
}


