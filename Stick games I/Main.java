#include<iostream>
using namespace std;
void print(int res){
  if(res % 2 == 0)
    {
        cout << "Mani Iyer";
    }
    else
    {
        cout << "Arun Gupta";
    }
}
int main()
{
    int n, m, r;
    cin >> n >> m;
    if(n < m)
    {
        r = n;
    }
    else
    {
        r = m;
    }
    print(r);
    return 0;
}