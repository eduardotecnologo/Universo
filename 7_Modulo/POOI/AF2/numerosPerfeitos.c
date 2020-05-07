// Desafio 3 : Programe um aplicativo em C que ache todos os números perfeitos até 1000. Número perfeito
// é aquele que é a soma de seus fatores.Por exemplo,
// 6 é divisível por 1, 2 e 3 ao passo que 6 = 1 + 2 + 3.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
  int i, j, k;
  printf("\nDigite o número: ");
  i = 0;
  for (i = 0; i < 100; i++)
  {
    k = 0;
    for (j = 1; j < i; j++)
    {
      if ((i % j) == 0)
      {
        k = j + k;
        if (k == i)
        {
          printf("%d\n", i);
        }
      }
    }
  }
  return 0;
}