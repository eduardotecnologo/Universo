/*5- Fa�a um algoritmo para ler dois inteiros (vari�veis A e B) e imprimir o resultado do quadrado
da diferen�a do primeiro valor pelo segundo*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int var01, var02,s,s1;

    printf("Digite o valor de a:");
    scanf("\n%d", &var01);

    printf("\nDigite o valor de b: ");
    scanf("%d", &var02);

    s = var01 - var02;
    s1 = s * s;
    printf("\nO resultado � %d", s1);

    return 0;
}
