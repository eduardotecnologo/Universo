// Desafio 1 : Programe um aplicativo em C que acha todos os números primos até 1000

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main()
{
  setlocale(LC_ALL, "");
  int i, j, n, rest, count;
  for (i = 2; i < 100; i++)
  {
    for (j = 1; j < 100; j++)
    {
      if (i % j == 0)
        // Verifica quantas ocorrências há de módulo 0, só existem 2 em primos
        n += 1;
    }
    if (n < 3)
    {
      printf("%5i", i);
      // Contador que pula linhas a cada 10 primos
      count += 1;
    }
    n = 0;
    if (count == 10)
    {
      printf("\n");
      count = 0;
    }
  }
  return 0;
}