#include<iostream>
#include<string>
using namespace std;
int main()
{
  int vow=0,con=0,ws=0,dig=0,sym=0;
  string s;
  getline(cin,s);
  for(int i=0;i<s.length();i++)
  {
    if(s[i]==32)
      ws++;
    else if(s[i]>=48 && s[i]<=57)
      dig++;
//    else if(s[i]=={65,69,73,79,85,97,101,105,111,117})
    else if(s[i]==65 || s[i]==69 || s[i]==73 || s[i]==79 || s[i]==85 || s[i]==97 || s[i]==101 || s[i]==105 || s[i]==111 || s[i]==117)
      vow++;
    else if((s[i]>=65 && s[i]<=90) || (s[i]>=97 && s[i]<=122))
      con++;
    else// if((s[i]>=33 && s[i]<=47) || (s[i]>=58 && s[i]<=64) || (s[i]>=91 && s[i]<=96) || (s[i]>=123 && s[i]<=126))
      sym++;
  }
  cout<<"Vowels:"<<vow;
  cout<<"\nConsonants:"<<con;
  cout<<"\nWhite Spaces:"<<ws;
  cout<<"\nDigits:"<<dig;
  cout<<"\nSymbols:"<<sym;
  return 0;
}