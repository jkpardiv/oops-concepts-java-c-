#include<iostream>
using namespace std;
#include <string>
#include <cctype>
bool isString(string str)
{
    int i;
    for (i = 0; i < str.length(); i++)
    {
        if (!((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z') || str[i] == ' '))
        {
            return false;
        }
    }
    return true;
}

int main()
{
	string name;
	cout<<"user name: ";
	cin>>name;
	 if (isString(name))
    {
        cout << "Hello " + name << endl;
    }
    else
        cout << "Invalid name" << endl;
}

