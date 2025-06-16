#include <stdio.h>

void printArraySize(int arr[]) {
    printf("%d\n", sizeof(int*)); 
}

int main() {
    int a1[] = {1, 2, 3, 4, 5};
    printArraySize(a1);
    return 0;
}
