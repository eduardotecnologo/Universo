// 2. Faça um algoritmo que leia um vetor N[20].A seguir, encontre o menor elemento do vetor N e a sua posição dentro do vetor, mostrando :
//  “O menor elemento de N é”, M, “e sua posição dentro do vetor é :”, P.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main()
{
  int N[20];
  int i, menor = 999999999, posicao;
  for (i = 0; i < 20; i++)
  {
    printf("\nDigite um número:\n");
    scanf("%d", &N[i]);
    if (N[i] < menor)
    {
      menor = N[i];
      posicao = i;
    }
  }
  printf("\nO menor elemento é %d, na posição %d", menor, posicao);
  return 0;
}