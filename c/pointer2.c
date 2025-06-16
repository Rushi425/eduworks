#include<stdio.h>
void swap(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;   
}

void main(){
    int a = 5;
    int b = 3;
    printf("old : %d - %d\n", a, b);
    swap(&a, &b);
    printf("new : %d - %d", a, b);
}
