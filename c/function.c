#include<stdio.h>

int add(int a, int b);
int sub(int a, int b);
void main(){
    int sum = add(4,5);
    printf("%d \n",sum);
    int sub1 = sub(4,5);
    printf("%d",sub1);
}

int add(int a, int b){
    return a+b;
}
int sub(int a, int b){
    return a-b;
}