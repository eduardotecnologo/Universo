/*3- Faça um algoritmo que digite o nome e idade de duas pessoas. Encontre e imprima a
diferenças de idades entre as pessoas. E a soma das idades das pessoas.*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int idade01, idade02, direfenca, soma;
    char nome01[50], nome02[50];

    printf("Por favor digite o primeiro nome: \n");
    scanf("%s", nome01);
    printf("\nDigite a idade: ");
    scanf("%d", &idade01);

    printf("Por favor digite o segundo nome: \n");
    scanf("%s", nome02);
    printf("\nDigite a idade: ");
    scanf("%d", &idade02);

    soma = idade01 + idade02;
    printf("\nA soma das idades é: %d", soma);

    if(idade01 > idade02){
        printf("\n%s é mais velho que %s", nome01, nome02 );
    }else if(idade01 < idade02){
        printf("\n%s é mais velho que %s", nome01, nome02 );
    }
    return 0;
}
