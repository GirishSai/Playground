#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(c>=n){
    cout<<"Yes";
}
  else if(n%r==0 && n%c==0){
    cout<<"Yes";
  }
  else if(n%c==1){
    cout<<"Yes";
  }
  else{
    cout<<"No";
  }
}