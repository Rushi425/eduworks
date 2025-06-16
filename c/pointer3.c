#include<stdio.h>
// void circle(float *a,float *b,float r){
//     *a = 3.14*r*r;
//     *b = 2*3.14*r;
// }


// void main(){
//     float a , b, r= 5;
//     circle(&a, &b, r);
//     printf("Radius of circle is %.2f\n", r);
//     printf("Area of circle is %.2f\n", a);
//     printf("Perimter of circle is %.2f\n", b);
// }
void rect(int l, int g, int *a, int *b){
    *a = l*g;
    *b = 2 * (l+g);
}
void main(){
    int l =5, g =5, a, b;
    rect(l, g, &a, &b);
    printf("Arae %d\n",a);
    printf("perimeter %d",b);
}