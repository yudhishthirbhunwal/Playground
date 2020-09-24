#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s;
  cin.get(s.name,50);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"\nStudent Details";
  cout<<"\nName: "<<s.name;
  cout<<"\nRoll: "<<s.roll;
  cout<<"\nMarks: "<<s.marks;
  return 0;
}