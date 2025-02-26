#include <stdio.h>

int main() {
    char input[100];
    printf("Enter input: ");
    gets(input);  // Unsafe function
    printf(input);  // Format string vulnerability
    return 0;
}
