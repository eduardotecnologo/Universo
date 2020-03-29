/*4. Faça um algoritmo que leia um vetor K[30].Troque a seguir, todos os elementos de ordem
ímpar do vetor com os elementos de ordem par imediatamente posteriores.*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
  int K[30], i, aux;
  for (i = 0; i < 30; i++)
  {
    printf("\nVetor[%d]=", i);
    scanf("%d", &K[i]);
  }
  for (i = 0; i < 29; i = i + 2)
  {
    aux = K[i];
    K[i] = K[i + 1];
    K[i + 1] = aux;
  }
  printf("\n");
  for (i = 0; i < 30; i++)
  {
    printf("\nResultado do K[%d]=%d", i, K[i]);
  }
  return 0;
}