/** 7- Fa�a um algoritmo para ler a base e a altura de um tri�ngulo. Em seguida, escreva a �rea do mesmo.
 * Obs.: �rea = ( Base * Altura ) / 2 */
#include <stdlib.h>
#include <stdio.h>

int main (void){
    float area, base, alt;
    printf("Calculando a �rea de um triangulo: ");
    printf("\nDigite o valor da base: ");
    scanf("%f", &base );

    printf("\nDigite o valor da altura: ");
    scanf("%f", &alt);

    area = (base * alt) / 2;
    printf("\nA �rea do triangulo � : %.2f.",area);
    system("pause");
    return 0;
}
