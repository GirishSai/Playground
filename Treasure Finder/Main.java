#include<iostream>
using namespace std;
int main()
{
int a,b,c;
  cin>>a>>b>>c;
  int t,n;
  if(a>b && a>c){
    if(b>c){
      t=b;
    }
    else{
      t=c;
    }
    n=a;
  }
  else if(b>a && b>c){
    if(a>c){
      t=a;
    }
    else{
      t=c;
    }
    n=b;
  }
  else if(c>a && c>b){
    if(a>b){
      t=a;
    }
    else{
      t=b;
    }
    n=c;
  }
    int r;
  for(int i=2;i<n;i++){
    if(a%i==0 && b%i==0 && c%i==0){
      r=i;
    }
}
if(r>n){
  r=1;
}
  cout<<"The treasure is in box which has number "<<t;
  cout<<"\nThe code to open the box is "<<r;
}