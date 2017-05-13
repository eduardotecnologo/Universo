#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, x, i, mult , quadra, ou;
    i=1;
    printf("     \n Para comecar insira a quantidade de numeros: ");
    scanf("%d", &n);

    while( i <= n){
    printf("      \n Insira o numero para a tabela: ");
    scanf("%d", &x);
    mult = x * 2;
    quadra = x*x;
    ou = x!= x;
     printf("\n \n--------------------------------------------------------- \n");
    printf(" | X      | 2X      | X*X      | X!         |\n");
    printf(" | %d     | %d      |  %d      | %d         | \n \n \n", x, mult, quadra,ou );
    printf("--------------------------------------------------------- \n");
    i++;
    }
    return 0;
}
