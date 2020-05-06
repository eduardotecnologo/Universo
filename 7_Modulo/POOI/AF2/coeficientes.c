// 3. Crie uma função que receba três valores, 'a', 'b' e 'c', que são os coeficientes de uma equação do segundo
// grau e retorne o valor do delta, que é dado por 'b2 - 4ac'
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int delta(float a, float b, float c)
{
  float resultado;
  resultado = b * b - 4 * a * c;
  return resultado;
}
int main(void)
{
  float a, b, c, resultado;
  printf("\nDigite o valor de A: ");
  scanf("%f", &a);
  printf("\nDigite o valor de B: ");
  scanf("%f", &b);
  printf("\nDigite o valor de C: ");
  scanf("%f", &c);
  printf("\nO resultado é = %.2f\n", resultado);
  return 0;
}