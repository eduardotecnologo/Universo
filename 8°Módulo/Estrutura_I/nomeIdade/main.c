/** 2- Fa�a um algoritmo que informe o nome e idade de duas pessoas. Mostre o nome e idade
das duas pessoas na tela. */
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(){

    char nome01[30];
    char nome02[30];
    int idade01;
    int idade02;

    printf("\nDigite o primeiro nome: ");
    scanf("%s", nome01);

    printf("\nDigite a idade: ");
    scanf("%d", &idade01);

    printf("\nDigite o segundo nome: ");
    scanf("%s", nome02);

    printf("\nDigite a idade: ");
    scanf("%d", &idade02);

    printf("\nO primeiro nome �: %s", nome01);
    printf("\nSua idade � : %d", idade01);
    printf("\nO segundo nome � : %s", nome02);
    printf("\nSua idade � : %d", idade02);

    return 0;
}
   // Sa�da
// Digite o primeiro nome: lucas

// Digite a idade: 25

// Digite o segundo nome: gabriel

// Digite a idade: 56

// O primeiro nome �: lucas
// Sua idade � : 25
// O segundo nome � : gabriel
// Sua idade � : 56
