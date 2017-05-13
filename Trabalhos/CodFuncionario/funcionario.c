#include <stdio.h>
#include <stdlib.h>

int main()
{
    int cod;

    printf("******** ######################### ********\n");
    printf("** Relação de Funcionários Cadastrados!! **\n");;
    printf("******** ######################### ********\n");

    printf("\nInforme o código do funcionário: \n");
    printf("** 101 para Vendedor **\n");
    printf("** 102 para Atendente **\n");
    printf("** 103 para Auxiliar Técnico **\n");
    printf("** 104 para Assistente **\n");
    printf("** 105 para Cordenador de Grupo **\n");
    printf("** 106 para Gerente **\n");
        scanf("%d", &cod);

    switch (cod)
        {
        case 101:
                printf("\nCódigo inserido: Vendedor!\n");
                break;
        case 102:
                printf("\nCódigo inserido: Atendente!\n");
                break;
        case 103:
                printf("\nCódigo inserido: Auxiliar Técnico!\n");
                break;
        case 104:
                printf("\nCódigo inserido: Assistente!\n");
                break;
        case 105:
                printf("\nCódigo inserido: Coordenador de Grupo!\n");
                break;
        case 106:
                printf("\nCódigo inserido: Gerente!\n");
                break;
        default:
            printf("\nCódigo inserido inválido!\n");
            printf("\n** Tente de Novo! **\n");
        }
    return 0;
}