#include <stdio.h>

struct Student {
    int roll;
    float marks;
};

int main() {
    struct Student s1 = {101, 89.5};
    struct Student *ptr = &s1;

    // Access using dot (.)
    printf("Roll: %d\n", s1.roll);

    // Access using arrow (->)
    printf("Marks: %.2f\n", ptr->marks);  // same as (*ptr).marks

    return 0;
}


//(*ptr).marks == ptr->marks
// The arrow operator (->) is used to access members of a structure through a pointer.
// It is a shorthand for dereferencing the pointer and then accessing the member using the dot operator.
// The expression (*ptr).marks dereferences the pointer ptr to get the structure it points to,
// and then accesses the marks member. The arrow operator ptr->marks does the same thing in a more concise way.
// The arrow operator is particularly useful when dealing with pointers to structures,
// as it simplifies the syntax and makes the code more readable.
// The arrow operator is a convenient way to access structure members through pointers,
// and it is widely used in C programming.
