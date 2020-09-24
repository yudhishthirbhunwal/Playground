#include <iostream>
int main()
{
  char str[100], rev[100];     
  int count = 0, end, i;
  std::cin.getline(str,100);
  for(i=0;i<100;i++)
  {
//    std::cout<<str[i];
    if(str[i]=='\0')
      break;
    count++;
  }
//  std::cout<<count;
  for(i=0;i<count;i++)
    rev[i]=str[count-i-1];
  std::cout<<rev;
  return 0;
}