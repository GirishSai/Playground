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

  cout<<"Sum of rows is ";
  int maxsum=0,id;
  for(int i=0;i<r;i++){
    int rs=0;
    for(int j=0;j<c;j++){
      rs=mat[i][j]+rs;
    }
    cout<<rs<<" ";
    if(rs>maxsum){
      maxsum=rs;
      id=i;
    }
}
  cout<<"\nRow "<<id+1<<" has maximum sum"; 
  int maxcol=0,cid;
  cout<<"\nSum of columns is ";
  for(int i=0;i<r;i++){
    int cs=0;
    for(int j=0;j<c;j++){
      cs=mat[j][i]+cs;
    }
    cout<<cs<<" ";
    if(cs>maxcol){
      maxcol=cs;
      cid=i;
}
}
  cout<<"\nColumn "<<cid+1<<" has maximum sum"; 
}