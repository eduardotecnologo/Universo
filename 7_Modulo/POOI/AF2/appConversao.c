// 11. Crie um aplicativo de conversão entre as temperaturas Celsius e Farenheit.Primeiro o usuário deve escolher se
// vai entrar com a temperatura em Célsius ou Farenheit, depois a conversão escolhida é realizada através de um comando SWITCH.
// Se C é a temperatura em Célsius e F em farenheit, as fórmulas de conversão são : C = 5.(F - 32) / 9 F = (9.C / 5) + 32
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(void)
{
  char convert;
  float Celsius, Farenheit;
  setlocale(LC_ALL, "portuguese");

  do
  {
    printf("\t Conversão entre as temperaturas Celsius e Farenheit \n\n");
    printf("\t Tecle 'F' para converter Celsius em Farenheit ");
    printf("\n\t ou tecle 'C' para converter Farenheit em Celsius ");
    printf("\n\n \t Tecle 'q' para sair ");
    scanf(" %c", &convert);
    switch (convert)
    {
    case 'F':
      printf("\t Entre com a temperatura em Celsius: ");
      scanf("%f", &Celsius);
      printf("\t A temperatura correspondente em Farenheit são: %.2f \n\n", ((1.8 * Celsius) + 32));
      system("pause");
      system("cls || clear");
      break;

    case 'C':
      printf("\t Entre com a temperatura em Farenheit: ");
      scanf("%f", &Farenheit);
      printf("\t A temperatura correspondente em Celsius são: %.2f \n\n", ((Farenheit - 32) / 1.8));
      system("pause");
      system("cls || clear");
      break;

    case 'q':
      printf("\t Encerrando !!! \n");
      break;

    default:
      //system("cls || clear");
      printf("\n\t\t Tecle o caracter 'F' ou 'C' \n\n");
      system("pause");
      system("cls || clear");
      break;
    }
  } while (convert != 'q');
}