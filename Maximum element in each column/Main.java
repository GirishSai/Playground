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
  for (int i = 0; i < c; i++) { 
        int max = mat[0][i]; 
        for (int j = 1; j < r; j++) { 
            if (mat[j][i] > max) 
                max = mat[j][i]; 
        } 
        cout << max << endl; 
    } 
  }