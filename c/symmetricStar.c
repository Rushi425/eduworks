#include<stdio.h>
void main(){

    // int n = 5;
    // for(int i = 0; i < n; i++){
    //     //left part
    //     for(int j = 0; j < n - i; j++){
    //         printf("*");
    //     }
    //     for(int k = 0; k < 2 * i; k++){
    //         printf(" ");
    //     }  
    //     for(int l = 0; l < n - i; l++){
    //         printf("*");
    //     }
    //     printf("\n");
    // }
    

    int n = 5;

    for(int i = 0; i < n; i++) {
        // Left numbers: 1 to n - i
        for(int j = 1; j <= n - i; j++) {
            printf("%d", j);
        }

        // Spaces: 2 * i
        for(int k = 0; k < 2 * i; k++) {
            printf(" ");
        }

        // Right numbers: n - i to 1
        for(int l = n - i; l >= 1; l--) {
            printf("%d", l);
        }

        printf("\n");
    }   
}