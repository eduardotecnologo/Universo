/*5. Faça um algoritmo que leia um vetor S[20] e uma variável A.A seguir, mostre o produto da
variável A pelo vetor.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{

  int s[20], a, i;

  for (i = 0; i < 20; i++)
  {

    printf("Informe S[%d]: ", i);

    scanf("%d", &s[i]);
  }

  printf("Informe a escalar: ");

  scanf("%d", &a);

  for (i = 0; i < 20; i++)

    s[i] *= a;

  for (i = 0; i < 20; i++)

    printf("S[%d] = %d\n", i, s[i]);

  return 0;
}