#include<iostream>
using namespace std;

int main()
{
int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
}
  int f;
  cin>>f;
  for(int i=0;i<n;i++){
    if(arr[i]==f){
      cout<<"She passed her exam";
      break;
    }
    else if(i==n-1){
      cout<<"She failed";
  }
  }
}