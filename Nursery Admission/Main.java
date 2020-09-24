#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1;
  getline(cin,str1);
  cout<<"The number of letters in the name is "<<str1.length();
  return 0;
}