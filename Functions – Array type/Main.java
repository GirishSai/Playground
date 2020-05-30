#include<iostream>
using namespace std;
int main()
{
  cout<<"Enter the number of elements in the array\n";
  int n;
  cin>>n;
  cout<<"Enter the elements in the array\n";
  int arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }
  int e=0,o=0;
  for(int i=0;i<n;i++){
    if(arr[i]%2==0){
      e=e+1;
    }
    else{
      o=o+1;
    }
  }
  
  if(e!=0 && o==0){
    cout<<"The array is Even";
  }
  else if(e==0 && o!=0){
    cout<<"The array is Odd";
  }
  else{
    cout<<"The array is Mixed";
  }
}