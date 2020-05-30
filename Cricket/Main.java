#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  int b,r,cr,cb;
  cin>>b>>r>>cr>>cb;
  int o=b/6;
  cout<<o<<"\n";
  int x=cb/6;
  float y=cb%6*0.1;
  float z=x+y;
  cout<<z<<"\n";
  float p=cr/z;
  printf("%.1f",p);
  cout<<"\n";
    float h=(float)r/(float)o;
  printf("%.1f",h);
  if(p>z){
      cout<<"\nEligible to Win";
  }
  else{
      cout<<"\nNot Eligible to Win";
  }
}
    
  

