// 2. Crie uma função que receba um valor e diga se é nulo ou não.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
  int num;
  
  printf("Por favor digite um valor: ");
  scanf("%d", &num);

  if (num > 0)
  {
    printf("\nO valor digitado não é nulo: ");
  }
  else if (num < 0)
  {
    printf("\nO valor digitado não é nulo: ");
  }
  else
  {
    printf("\nO valor digitado é nulo!");
  }
  return 0;
}