// Escrever um programa que cadastre o nome, a altura, o peso, o cpf e sexo de algumas pessoas.Com os dados 
// cadastrados, em seguida localizar uma pessoas através do seu CPF e imprimir o seu IMC.
#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    char nome[50];
    char sexo; // 'm': masculino, 'f': femino
    float peso;
    float altura;
    long int cpf;
} Pessoa;
int main()
{
    Pessoa pessoas[3];

    printf("Campos: Nome, Altura, Peso, Cpf, Sexo\n");
    for (int i = 0; (i < 3); i++)
    {
        printf("\nInforme os dados da pessoa(%i): ", i + 1);
        scanf("%s %f %f %ld %c", pessoas[i].nome, &pessoas[i].altura, &pessoas[i].peso, &pessoas[i].cpf, 
        &pessoas[i].sexo);
    }
    //Pesquisa por CPF
    printf("\nInforme o CPF da pessoa: \n");
    long int cpf_localizador;
    scanf("%ld", &cpf_localizador); 

    printf("\nSexo\tNome\tIMC");
    for (int i = 0; (i < 3); i++)
    { 
        if (cpf_localizador == pessoas[i].cpf)
        { 
            float imc = pessoas[i].peso / (pessoas[i].altura * pessoas[i].altura);
            printf("\n%c\t%s\t%1.2f\n", pessoas[i].sexo,pessoas[i].nome, imc);
            break;
        }
    }

    getchar();
    return 0;
}