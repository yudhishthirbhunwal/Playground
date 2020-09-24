#include<iostream>
#include<ios>
#include<limits>
using namespace std;
struct employee
{
  char name[20];
  int id;
  int age;
  char design[20];
  int salary;
};
int main()
{
  employee e;
  cout<<"Enter name:";
  cin.get(e.name,20);
  cout<<"\nEnter ID:";
  cin>>e.id;
  cout<<"\nEnter age:";
  cin>>e.age;
  cout<<"\nEnter designation:";
  cin.ignore(numeric_limits<streamsize>::max(),'\n');
  cin.get(e.design,20);
  cout<<"\nEnter Salary:";
  cin>>e.salary;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.design;
  cout<<"\nSalary of the Employee : "<<e.salary;
  return 0;
}