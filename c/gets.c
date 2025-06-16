#include <stdio.h>
#include <string.h>

int main() {

    // char str[100];
    // printf("Enter a string: ");
    // fgets(str, sizeof(str), stdin);
    // printf("You entered: %s\n", str);

    char a1[] = "hello";
    char a2[20] = "world";
    
    strcat(a2, a1);
    
    printf("Target: %s\n", a2);
    printf("Source: %s\n", a1);
    
    return 0;
}
