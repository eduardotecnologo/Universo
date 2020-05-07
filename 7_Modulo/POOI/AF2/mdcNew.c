// Desafio 2 : Programe um aplicativo em C que recebe dois inteiros e retorna o MDC, máximo divisor comum.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int menor(int a, int b);
int maior(int a, int b);
int MDC(int a, int b, int cont, int temp);

int main(void)
{

  int num1, num2, cont, mdc, temp;

  printf("\tPrograma em C que determina o M.D.C entre dois numeros.\n\n");
  printf("Insira dois numeros inteiros: \n");
  scanf("%d", &num1);
  scanf(" %d", &num2);

  mdc = MDC(num1, num2, cont, temp);

  printf("\n");

  printf("\nO maximo divisor comum entre %d e %d e igual a %d\n\n", num1, num2, mdc);
}

int menor(int a, int b)
{
  if (a <= b)
    return a;
  else
    return b;
}

int maior(int a, int b)
{
  if (a >= b)
    return a;
  else
    return b;
}

int MDC(int a, int b, int cont, int temp)
{
  temp = a;
  a = menor(a, b);
  b = maior(temp, b);

  cont = a;

  while (b % cont != 0 || a % cont != 0)
  {
    cont--;
  }
  return cont;
}