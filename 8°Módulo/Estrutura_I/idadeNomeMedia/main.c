/**4- Faça um algoritmo que solicite a idade e o nome de quatro pessoas. Calcule e imprima a
média aritmética das idades. */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main()
{
    char nome1[50], nome2[50],nome3[50],nome4[50];
    int idade1, idade2, idade3,idade4, media;

    printf("Digite  o primeiro nome: ");
    scanf("%s", nome1);
    printf("\nDigite a idade: ");
    scanf("%i", &idade1);

    printf("\nDigite  o segundo nome: ");
    scanf("%s", nome2);
    printf("\nDigite a idade: ");
    scanf("%i", &idade2);

    printf("\nDigite  o terceiro nome: ");
    scanf("%s", nome3);
    printf("\nDigite a idade: ");
    scanf("%i", &idade3);

    printf("\nDigite  o quarto nome: ");
    scanf("%s", nome4);
    printf("\nDigite a idade: ");
    scanf("%i", &idade4);

    media = (idade1 + idade2 + idade3 + idade4) / 4;

    printf("A média das idade é:  %i", media);
    return 0;
}
