#include<iostream>
#include<string>
using namespace std;
void strcmp(string s1,string s2)
{
  if(s1.compare(s2)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}
int main()
{
  string str1,str2;
  getline(cin,str1);
  getline(cin,str2);
  strcmp(str1,str2);
  return 0;
  
}