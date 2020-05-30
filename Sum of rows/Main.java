#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int mat[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>mat[i][j];
    }
  }
  int i=0;
  int s=0;
  while(i<r){
    for(int j=0;j<c;j++){
      s=s+mat[i][j];
    }
    cout<<s<<"\n";
    i++;
    s=0;
  }
}