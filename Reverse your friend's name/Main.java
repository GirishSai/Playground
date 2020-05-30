#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
string s1;
  getline(cin,s1);
 
  for(auto i=s1.crbegin();i<s1.crend();i++){
    cout<<*i;
  }
}