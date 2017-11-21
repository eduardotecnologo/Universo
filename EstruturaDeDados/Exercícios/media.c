// Escrever um programa que cadastre o nome, a matrícula e duas notas de vários alunos.
// Em seguida imprima a matrícula, o nome e a média de cada um deles.
#include <stdio.h>

typedef struct
{
    int matricula;
    char nome[30];
    float nota1;
    float nota2;
    float nota3;
} Aluno;

int main()
{
    Aluno alunos[3];
    printf("Dados: Nome(sem espaços), Matrícula, nota 1, nota 2 e nota 3\n");
    for (int i = 0; (i < 3); i++)
    {
        printf("\nInforme os dados do aluno(%i): \n", i + 1);
        scanf("%s %i %f %f %f", alunos[i].nome, &alunos[i].matricula, &alunos[i].nota1, &alunos[i].nota2, 
        &alunos[i].nota3);
    }
    printf("\nMatricula:\tNome:    \tMedia:\n");
    for (int i = 0; (i < 3); i++)
    {
        printf("%i      \t%s        \t%1.2f \n", alunos[i].matricula, alunos[i].nome,(alunos[i].nota1 + alunos[i].nota2 + 
        alunos[i].nota3) / 3);
    }

    getchar();
    return 0;
}