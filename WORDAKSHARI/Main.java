#include<iostream>
#include<string>
using namespace std;
int main()
{
  int index=0;
  string s,stemp;
  while(s!="####")
  {
    getline(cin,s);
    if(index==0)
    {
      cout<<s;
      stemp=s;
      index++;
    }
    else
    {
      if(stemp.back()==s.front())
      {
        cout<<"\n"<<s;
        stemp=s;
      }
    }
  }
  return 0;
}