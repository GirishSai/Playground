#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int d=s1.find(s2);
  if(s1=="CodeLab"){
    cout<<"It is wrong";
  }
  else{
  if(d==0){
    cout<<"It is correct";
  }
  else{
    cout<<"It is wrong";
  }
  }
}