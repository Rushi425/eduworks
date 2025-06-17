#include<stdio.h>

void main() {
    typedef int integer; // Define a new type 'integer' as an alias for 'int'
    integer a = 10; // Declare a variable 'a' of type 'integer'
    printf("Value of a: %d\n", a); // Print the value of 'a'


    typedef struct {
        int x;
        int y;
    } Point; // Define a new type 'Point' as a structure with two integer members

    struct name{
        char first[20];
        char last[20];
    }
    name.first[20] = "John"; // Declare a variable 'name' of type 'struct name'
    name.last[20] = "Doe"; // Assign values to the members of 'name'
    
    printf("Point coordinates: (%d, %d)\n", a.x, a.y); 
    printf("Name: %s %s\n", name.first, name.last); // Print
    

}