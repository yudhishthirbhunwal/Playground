#include<iostream>
using namespace std;
int maxSum(int a[],int n)
{
  int temp=a[0],count=1;
  for(int i=1;i<n;i++)
  {
    if(temp<a[i])
    {
      temp=a[i];
      count++;
    }
  }
  return count;
}
int main()
{
  int m,n,s;
  cin>>m>>n;
  int a[m][n],arr1[m],arr2[n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
  {
    s=0;
    for(int j=0;j<n;j++)
    {
      s+=a[i][j];
    }
    cout<<s<<" ";
    arr1[i]=s;
  }
  cout<<"\nRow "<<maxSum(arr1,m)<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(int j=0;j<n;j++)
  {
    s=0;
    for(int i=0;i<m;i++)
    {
      s+=a[i][j];
    }
    cout<<s<<" ";
    arr2[j]=s;
  }
  cout<<"\nColumn "<<maxSum(arr2,n)<<" has maximum sum";
  return 0;
}