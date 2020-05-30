#include<iostream>
using namespace std;
struct employee{
  char name[25];
  int id;
  int age;
  char desi[25];
  double salary;
};

int main()
{
  employee e1;
  cin>>e1.name>>e1.id>>e1.age>>e1.desi>>e1.salary;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\nEmployee Details";
  cout<<"\nName of the Employee : "<<e1.name;
  cout<<"\nID of the Employee : "<<e1.id;
  cout<<"\nAge of the Employee : "<<e1.age;
  cout<<"\nDesignation of the Employee : "<<e1.desi;
  cout<<"\nSalary of the Employee : "<<e1.salary;
}