#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
 int n;
  cin>>n;
  int *p;
  p=(int *)calloc(n,sizeof(int));
  for(int i=0;i<n;i++){
    std::cin>>*(p+i);
  }
  int m=0,f=0;
  for(int i=0;i<n;i++){
    if(p[i]%2==0){
      f=f+1;
    }
    else{
      m=m+1;
    }
  }
  cout<<m<<"\n"<<f;
  return 0;
}