// Crie uma função que receba um valor e informe se ele é positivo ou não.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
  // Acentos no Termninal
  setlocale(LC_ALL, "Portuguese");
  // Variaveis
  int numero;
  // Entrada
  printf("Digite um número: ");
  scanf("%d", &numero);
  // Processamento e saída
  if (numero % 2 == 0)
  {
    printf("\nO número digitado é positivo!");
  }
  else
  {
    printf("\nO número digitado é negativo");
  }
  return 0;
}
