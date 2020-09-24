#include<iostream>
using namespace std;
void insert(int* A,int n,int l,int v)
{
  int temp=0;
  for(int i=l-1;i<=n;i++)
  {
    temp=A[i];
    A[i]=v;
    v=temp;
  }
}
void print(int* A,int n)
{
  cout<<"\nArray after insertion is";
  for(int i=0;i<=n;i++)
    cout<<"\n"<<*(A+i);
}
int main()
{
  int n,m,x;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>m;
  if(m>n)
    cout<<"\nInvalid Input";
  else
  {
    cout<<"\nEnter the value to insert";
    cin>>x;
    insert(a,n,m,x);
    print(a,n);
  }
  return 0;
}