#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *buffer = (char *)malloc(10);
    strcpy(buffer, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");  // Heap overflow
    printf("%s\n", buffer);
    free(buffer);
    return 0;
}
