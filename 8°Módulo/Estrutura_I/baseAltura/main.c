/** 7- Faça um algoritmo para ler a base e a altura de um triângulo. Em seguida, escreva a área do mesmo.
 * Obs.: Área = ( Base * Altura ) / 2 */
#include <stdlib.h>
#include <stdio.h>

int main (void){
    float area, base, alt;
    printf("Calculando a área de um triangulo: ");
    printf("\nDigite o valor da base: ");
    scanf("%f", &base );

    printf("\nDigite o valor da altura: ");
    scanf("%f", &alt);

    area = (base * alt) / 2;
    printf("\nA área do triangulo é : %.2f.",area);
    system("pause");
    return 0;
}
