#include<cstring>
#include<iostream>
using namespace std;
int main()
{
  char cap[100];
  char* ptr;
  int count=0;
  cin.get(cap,100);
  ptr=strtok(cap," ,.-");
  while(ptr!=NULL)
  {
    count++;
    ptr=strtok(NULL," ,.-");
  }
//  cout<<count<<"\n";
  if(count<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
  
  return 0;
}