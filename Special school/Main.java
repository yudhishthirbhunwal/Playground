#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1,str2,str3;
  getline(cin,str1);
  getline(cin,str2);
  for(auto i=str2.rbegin();i<str2.rend();i++)
    str3+=*i;
  if(str1==str3)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}