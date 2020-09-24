#include<iostream>
#include<ios>
#include<limits>
using namespace std;
struct College
{
  char name[30];
  char city[20];
  int estbYear;
  float passPer;
};
int main()
{
  int n;
  cout<<"Enter the number of colleges ";
  cin>>n;
  College c[n];
  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name ";
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cin.get(c[i].name,30);
    cout<<"\nEnter city ";
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    cin.get(c[i].city,20);
    cout<<"\nEnter year of establishment ";
    cin>>c[i].estbYear;
    cout<<"\nEnter pass percentage ";
    cin>>c[i].passPer;
  }
  cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<c[i].name;
    cout<<"\nCity:"<<c[i].city;
    cout<<"\nYear of establishment:"<<c[i].estbYear;
    cout<<"\nPass percentage:"<<c[i].passPer;
  }
}