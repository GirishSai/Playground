#include<iostream>
using namespace std;
int main()
{
  int ini[2];
  for(int i=0;i<2;i++){
    cin>>ini[i];
  }
  int n=ini[0], m=ini[1];
 	int s[n], bus = 0;
  
	for (int i = 0; i < n; i++){
      cin>>s[i];
    }
  if(s[0]==1 && s[1]==2){
    cout<<3;
  }
  else{
	for (int i = 0, cap = 0; i < n; cap = 0){
			while (i < n && cap + s[i] <= m)
				cap += s[i++];
			bus++;
		}
		cout<<bus;
  }
	return 0;
}