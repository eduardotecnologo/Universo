// 6. Crie uma função em linguagem C que receba 2 números e retorne o menor valor.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main()
{
  int num1, num2;
  printf("Digite o primeiro número: ");
  scanf("%d", &num1);
  printf("\nDigite o segundo número: ");
  scanf("%d", &num2);

  if (num1 < num2)
  {
    printf("O menor núemero é o %d", num1);
  }
  else
  {
    printf("o menor número é o %d", num2);
  }

  return 0;
}