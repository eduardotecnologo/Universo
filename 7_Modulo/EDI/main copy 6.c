#include <stdio.h>
#include <stdlib.h>

int main()
{
  // Definição de variáveis
  float n1, n2, n3, media;
  // Entrada de dados
  scanf("%f%f%f", &n1, &n2, &n3);
  // Operação
  media = (n1 + n2 + n3) / 3;
  // Saída de dados
  printf("%f", n1);
  printf("%f", n2);
  printf("%f", n3);
  printf("%f", media);
  system("PAUSE");
}