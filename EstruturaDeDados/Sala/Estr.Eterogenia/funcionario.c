#include <stdio.h>
#include <stdlib.h>
// #include <conio.h>
typedef struct tipo_funcionario{
    int matricula;
    char nome[60];
}funcionario;
int main(){
    funcionario f;
    printf("Digite a matrícula:\n");
    scanf("%d",&f.matricula);
    getchar();
    printf("Digite o nome do funcionário;\n");
    gets(f.nome);
    printf("\nMatricula %d\n",f.matricula);
    printf("\nNome %s\n",f.nome);
    return 0;
}