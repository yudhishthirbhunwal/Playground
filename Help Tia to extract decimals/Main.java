#include<iostream>
#include<string>
using namespace std;
int main() 
{
  string fnum;
  getline(cin, fnum);
  cout<<"Floating part is : ";
  for(int i=0;i<fnum.length();i++)
  {
    if(fnum[i]=='.')
    {
      for(int j=i+1;j<fnum.length();j++)
        cout<<fnum[j];
    }
  }
}