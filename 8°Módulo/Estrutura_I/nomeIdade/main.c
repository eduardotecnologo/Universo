/** 2- Faça um algoritmo que informe o nome e idade de duas pessoas. Mostre o nome e idade
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

    printf("\nO primeiro nome é: %s", nome01);
    printf("\nSua idade é : %d", idade01);
    printf("\nO segundo nome é : %s", nome02);
    printf("\nSua idade é : %d", idade02);

    return 0;
}
   // Saída
// Digite o primeiro nome: lucas

// Digite a idade: 25

// Digite o segundo nome: gabriel

// Digite a idade: 56

// O primeiro nome é: lucas
// Sua idade é : 25
// O segundo nome é : gabriel
// Sua idade é : 56
