#include<iostream>
using namespace std;
int main()
{
 int fp,fs,fd,sp,ss,sd,ap,as,ad;
  cin>>fp>>fs>>fd>>sp>>ss>>sd>>ap>>as>>ad;

  int ft=fp-((0.01*fs))*fp+fd;
  int st=sp-((0.01*ss))*sp+sd;
  int at=ap-((0.01*as))*ap+ad;
  cout<<"In Flipkart Rs."<<ft<<"\n";
  cout<<"In Snapdeal Rs."<<st<<"\n";
  cout<<"In Amazon Rs."<<at<<"\n";
  if(ft<=st && ft<=at){
    cout<<"He will prefer Flipkart";
  }
  else if(st<ft && st<at){
    cout<<"He will prefer Snapdeal";
  }
  else if(at<st && at<ft){
    cout<<"He will prefer Amazon";
  }
}