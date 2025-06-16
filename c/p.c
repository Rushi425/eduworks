#include<stdio.h>
#include<string.h>

void main(){
    // char a[10] = "    ";
    // int size = strlen(a);
    // printf("%d\n", size);
    
    char a[] = "Hello,";
    char b[] = "World!";
    strcat(b,a);
    printf("%s\n", b);


    int arr[10];
    int a1[] ={1,2,3};
    int a2[2] = {'a','b'};
    int l = sizeof(a2);
    printf("%d", l);
    // printf("%d", a2[2]);

}