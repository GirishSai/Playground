#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int m1[m][n];
  int m2[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      cin>>m1[i][j];
    }
  }
   for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      cin>>m2[i][j];
    }
  }
  int sum[m][n];
   for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      sum[i][j]=m1[i][j]+m2[i][j];
    }
  }
   for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
     cout<<sum[i][j]<<" ";
    }
     cout<<"\n";
  }
  
}