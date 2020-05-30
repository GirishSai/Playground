#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[100], temp;
    int i, j;
    cin.getline(str,20);
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    cout<< str;
    return 0;
}