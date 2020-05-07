// 10. Use a função da questão passado e lance o dado 1 milhão de vezes.Conte quantas vezes
//     cada número saiu.A probabilidade deu certo ? Ou seja,  a porcentagem dos números foi parecida ?
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int dado();

int main()
{
  int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0,
      count;

  for (count = 0; count < 1000000; count++)
    switch (dado())
    {
    case 1:
      num1++;
      break;
    case 2:
      num2++;
      break;
    case 3:
      num3++;
      break;
    case 4:
      num4++;
      break;
    case 5:
      num5++;
      break;
    case 6:
      num6++;
    }

  printf("Numero 1: %d -> %.2f\%%\n", num1, (num1 / 1000000.0) * 100);
  printf("Numero 2: %d -> %.2f\%%\n", num2, (num2 / 1000000.0) * 100);
  printf("Numero 3: %d -> %.2f\%%\n", num3, (num3 / 1000000.0) * 100);
  printf("Numero 4: %d -> %.2f\%%\n", num4, (num4 / 1000000.0) * 100);
  printf("Numero 5: %d -> %.2f\%%\n", num5, (num5 / 1000000.0) * 100);
  printf("Numero 6: %d -> %.2f\%%\n", num6, (num6 / 1000000.0) * 100);

  printf("\nTotal: %d -> %.2f\%%\n", num1 + num2 + num3 + num4 + num5 + num6,
         (num1 / 1000000.0) * 100 + (num2 / 1000000.0) * 100 +
             (num3 / 1000000.0) * 100 + (num4 / 1000000.0) * 100 +
             (num5 / 1000000.0) * 100 + (num6 / 1000000.0) * 100);
}

int dado()
{
  return (1 + rand() % 6);
}

// edudeveloper @Eduardo - MacBook - Pro  ~ / Documents / Git / Universo / 7_Modulo / POOI / AF2   master ● ?                                                         ✔  3988  13 : 35 : 46
// ▶ ./ dadosMilhao
// Numero 1 : 166134->16.61 %
// Numero 2 : 167335->16.73 %
// Numero 3 : 166878->16.69 %
// Numero 4 : 167291->16.73 %
// Numero 5 : 165849->16.58 %
// Numero 6 : 166513->16.65 %
// Total : 1000000->100.00 %