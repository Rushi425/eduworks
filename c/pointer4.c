#include<stdio.h>
void rect(int l, int g, int *a, int *b){
    *a = l*g;
    *b = 2 * (l+g);
}
void main(){
    int l =5, g =5, a, b;
    rect(l, g, &a, &b);
    printf("Arae %d",a);
    printf("perimeter %d",b);
}