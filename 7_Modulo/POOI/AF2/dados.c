// 9. Crie uma função em linguagem C chamado Dado() que retorna, através de sorteio, um número de 1 até 6.
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int Dado()
{
  return (1 + rand() % 6);
}
