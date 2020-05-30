#include <iostream>
#include<string>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
};
int main() 
{
   student s1;
  string n;
  getline(cin,n);
  int r;
  int m;
 s1.name=n;
    cin>>r>>m;
  s1.roll=r;
  s1.marks=m;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s1.name;
  cout<<"\nRoll: "<<s1.roll;
  cout<<"\nMarks: "<<s1.marks;
}