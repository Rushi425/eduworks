#include<stdio.h>
#include<string.h>
void main(){
    char str1 [60];
    char str2 [60];
    char *a, *b;
    printf("Enter a string: ");
    fgets(str1, sizeof(str1), stdin);
    // puts(str1);
    a = str1;
    b = str2;
    while(*a != '\0'){
        if(*a == 'a' || *a == 'e' ||*a == 'i' ||*a == 'o' ||*a == 'u'){
            a++;
        }
        else if(*a == 'A' || *a == 'E' ||*a == 'I' ||*a == 'O' ||*a == 'U'){
            a++;
        }
        else{
            *b++ = *a++;
        }
    }
    printf("str2: ");
    puts(str2);
}