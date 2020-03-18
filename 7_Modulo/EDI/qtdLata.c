// Construa um programa que calcule a quantidade de latas de tinta necessárias e o custo para pintar tanques
//     cilíndricos de combustível,
//     onde são fornecidos a altura e o raio desse cilindro.Sabendo que :
//     -a lata de tinta custa R$20, 00
//     - cada lata contém 5 litros cada litro de tinta pinta 3 metros quadrados.
//     e que : Área do cilindro = 2 vezes a área da base + circunferencia da base vezes a altura :
//     e que raio e altura são dados de entrada :
//     e que : Área do cilindro = 2 vezes a área da base + circunferencia da base vezes a altura :
//     e que raio e altura são dados de entrada.

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
  float altura, raio, areaCilindro, qtdLitros, qtdLatas, custo;
  printf("\nDigite o valor da altura do cilindro em metros:\n");
  scanf("%f", &altura);
  printf("\nDigite o valor do raio em metros:\n");
  scanf("%f", &raio);
  // Calcula a área do cilindro em metros quadrados
  areaCilindro = 2 * 3.14 * raio * raio + 2 * 3.14 * raio * altura;
  printf("\nA area do cilindro é %.2f metros quadrados", areaCilindro);
  // Calcula a quantidade de litros necessários
  qtdLitros = areaCilindro / 3;
  printf("\nA quantidade de litros necessária é de %.2f", qtdLitros);
  // Calcula a quantidade de latas necessárias
  qtdLatas = qtdLitros / 5;
  printf("\nA quantidade de latas necessárias é de %.2f", qtdLatas);
  //Calcula o valor total de tintas
  custo = qtdLatas * 20;
  printf("\nO valor total das tintas é de R$ %.2f\n", custo);
  return 0;
}
