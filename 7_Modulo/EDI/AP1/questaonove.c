#include <stdio.h>
#include <stdlib.h>
int main()

{

  int a[][4] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

  int i;

  for (i = 0; i < 3; ++i)

    printf("%d", *(a[i] + 1));
}