// Desafio 4 : Crie um programa em C que receba um número e imprima ele na ordem inversa.Ou seja, se recebeu o inteiro 123, deve imprimir o inteiro 321.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
  int a, n;
  printf("Quantos numeros pretendes exibir? ");
  scanf("%i", &n);
  printf("Ordem normal:\n");
  for (a = 1; a <= n; a++)
    printf("%d ", a);
  printf("\n\nOrdem inversa:\n");
  for (a = n; a > 0; a--)
    printf("%d ", a);
  printf("\n\n");
  system("pause");
}