#include<iostream>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  int n=s2.length();
  for(int i=0;i<n/2;i++){
    swap(s2[i],s2[n-i-1]);
  }
  int d=s1.find(s2);
  if(d==0){
    cout<<"It is correct";
  }
  else{
    cout<<"It is wrong";
  }  
}