#include<iostream>
using namespace std;
int main()
{
  int a;
  double t;
  cin>>a>>t;
  if(a>13 && t==13.30){
    cout<<"$5.00";
  }
  else if(t==13.30 && a<=13){
    cout<<"$2.00";}
  else if(t!=13.30 && a>13){
    cout<<"$8.00";
  }
  else if(t!=13.30 && a<=13){
    cout<<"$4.00";
  }
}