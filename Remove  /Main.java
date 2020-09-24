#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s;
  size_t found;
  getline(cin,s);
  do
  {
    found=s.find("the");
    s.erase(found,4);
  }while((found=s.find("the"))!=string::npos);
  cout<<s;
  return 0;
}