#include<iostream>
using namespace std;
int main()
{
	char op;
	int a,b;
	cout<<"enter two values : ";
	cin>>a>>b;
	cout<<"enter operator : ";
	cin>>op;
	switch(op)
	{
		case '+' : cout<<"sum = "<<a+b;
			   break;
		case '-' : cout<<"diff= "<<a-b;
			   break;
		case '/' : cout<<"division ="<<a/b;
			   break;
		case '*' : cout<<"multiplication ="<<a*b;
		           break;
		case '%' : cout<<"remainder= "<<a%b;
				break;
	}
}