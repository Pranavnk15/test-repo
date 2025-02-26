#include <stdlib.h>

int main() {
    int *ptr = (int *)malloc(sizeof(int));
    *ptr = 10;
    free(ptr);
    *ptr = 20;  // Use after free
    return 0;
}
