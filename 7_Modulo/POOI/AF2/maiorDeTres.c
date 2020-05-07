// 7. Crie uma função em linguagem C que receba 3 números e retorne o maior valor, use a função da questão 4.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main()
{
  int num1, num2, num3;
  printf("Digite o primeiro número: ");
  scanf("%d", &num1);
  printf("Digite o segundo número: ");
  scanf("%d", &num2);
  printf("Digite o terceiro número: ");
  scanf("%d", &num3);

  if (num1 > num2 & num1 > num3)
  {
    printf("\nO maior número digitado é o: %d", num1);
  }
  else if (num2 > num1 & num2 > num3)
  {
    printf("\nO maior número digitado é o: %d", num2);
  }
  else
  {
    printf("\nO maior número digitado é o: %d", num3);
  }
  return 0;
}