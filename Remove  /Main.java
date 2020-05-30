#include<iostream>
using namespace std;
int main()
{
  string s1;
  getline(cin,s1);
  string s2="the";
  int d=s1.find(s2);
  s1.erase(d-1,4);
  int h=s1.find(s2);
  s1.erase(h-1,4);
  cout<<s1;
}