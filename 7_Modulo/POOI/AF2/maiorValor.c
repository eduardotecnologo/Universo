// 5. Crie uma função em linguagem C que receba 2 números e retorne o maior valor.
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

  if (num1 > num2)
  {
    printf("\nO maior número digitado é o: %d", num1);
  }
  else
  {
    printf("\nO maior número digitado é o: %d", num2);
  }
  return 0;
}