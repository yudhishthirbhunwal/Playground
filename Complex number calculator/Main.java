#include<iostream>
using namespace std;
struct comN
{
  int r,i;
};
comN getData(comN s)
{
  cin>>s.r>>s.i;
  return s;
}
comN add(comN s1,comN s2)
{
  comN sr;
  sr.r=s1.r+s2.r;
  sr.i=s1.i+s2.i;
  return sr;
}
comN sub(comN s1,comN s2)
{
  comN sr;
  sr.r=s1.r-s2.r;
  sr.i=s1.i-s2.i;
  return sr;
}
comN prod(comN s1,comN s2)
{
  comN sr;
  sr.r=(s1.r*s2.r)-(s1.i*s2.i);
  sr.i=(s1.r*s2.i)+(s1.i*s2.r);
  return sr;
}
void disp(comN s)
{
  cout<<s.r<<showpos<<s.i<<"i";
}
int main() 
{
  int n;
  comN c1,c2,res;
  cin>>n;
  c1=getData(c1);
  c2=getData(c2);
  switch(n){
    case 1: res=add(c1,c2);
      disp(res);
      break;
    case 2: res=sub(c1,c2);
      disp(res);
      break;
    case 3: res=prod(c1,c2);
      disp(res);
      break;
    default: cout<<"Invalid choice";
  }
  return 0;
}