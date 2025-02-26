#include <stdio.h>
#include <string.h>

void vulnerable_function(char *input) {
    char buffer[10];
    strcpy(buffer, input);  // Vulnerable to buffer overflow
}

int main() {
    char input[20];
    printf("Enter input: ");
    gets(input);  // Unsafe function
    vulnerable_function(input);
    return 0;
}
