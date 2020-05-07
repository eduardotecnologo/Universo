// Desafio 2 : Programe um aplicativo em C que recebe dois inteiros e retorna o MDC, máximo divisor comum.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int mdc(int num1, int num2)
{
  int resto;
  do
  {
    resto = num1 % num2;
    num1 = num2;
    num2 = resto;
  } while (resto != 0);
  return num1;
}

int main()
{
  assert(3 == mdc(24, 9));
  assert(10 == mdc(30, 20));
  return 0;
}