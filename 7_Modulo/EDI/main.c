#include <stdio.h>
#include <stdlib.h>

int main()
{
  float n1, n2, n3, media;
  printf("Por favor, Digite 3 nota:\n");
  scanf("%f%f%f", &n1, &n2, &n3);
  media = (n1 + n2 + n3) / 3;
  printf("A Média é: %.2f\n", media);
  return 0;
}