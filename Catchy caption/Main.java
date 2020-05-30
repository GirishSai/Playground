#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   string ch;
  getline(cin,ch);
  int count=0;
  for(int i=0;i<ch.length();i++){
    if(ch[i]==' '){
      count=count+1;
    }
  }
  if(count<=10){
    cout<<"Caption eligible for the contest";
  }
  else{
    cout<<"Caption not eligible for the contest";
}
}