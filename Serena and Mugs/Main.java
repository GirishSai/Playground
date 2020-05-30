#include<iostream>
using namespace std;
int printresult(int*,int,int);
int main()
{
  int ini[2];
  for(int i=0;i<2;i++){
    cin>>ini[i];
  }
  int n,s;
  n=ini[0];
  s=ini[1];
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  int *a;
  a=arr;
  printresult(a,n,s);
}
int printresult(int *arr,int z,int x){
  if(*arr==1){
    cout<<"YES";
  }
    else{
      cout<<"NO";
    }
}