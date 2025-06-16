#include <stdio.h>

int main() {
    int a = 4;
    int *b = &a;
    int **c = &b;

    printf("a = %d\n", a);
    printf("*b = %d\n", *b);
    printf("**c = %d\n", **c);

    printf("Address of a: %p\n", &a);
    printf("Value of b (should be address of a): %p\n", b);
    printf("Value of c (should be address of b): %p\n", c);
    printf("Address of b: %p\n", &b);
    
    a = a + *b + **c;
    printf("%d", a);
       
    return 0;
}
