/*3. Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos
elementos de mesmo índice,colocando o resultado em um terceiro vetor.Mostre o vetor resultante.*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main()
{
  int a[10], b[10], c[10], i;
  for (i = 0; i < 10; i++)
  {
    printf("\nInsira %d elemento do Primeiro vetor:", (i + 1));
    scanf("%d", &a[i]);
  }
  for (i = 0; i < 10; i++)
  {
    printf("\nInsira %d elemento do Segundo vetor:", (i + 2));
    scanf("%d", &b[i]);
  }
  for (i = 0; i < 10; i++)
  {
    c[i] = a[i] * b[i];
    printf("\n%dO elemento do vetor resultante: %d",(i+1),c[i]);
  }
  return 0;
}