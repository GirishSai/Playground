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
  int e=0,o=0;
  for(int i=0;i<n;i++){
    if((arr[i])%2==0){
      e=e+arr[i];
    }
    else if((arr[i])%2!=0){
      o=o+arr[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<e;
  cout<<"\nThe sum of the odd numbers in the array is "<<o;
}