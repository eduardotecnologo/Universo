// 5. Faça um algoritmo que leia um vetor S[20] e uma variável A. A seguir, mostre o produto da
// variável A pelo vetor.

#include <stdio.h>
#include <stdlib.h>

const int MAXIMO = 20;

int main()
    {
        int S[MAXIMO];
        int A,i = 0;

    printf("Informe um valor para a variavel A: ");
    scanf("%d",&A);

    printf("\n");
        for(i=0;i<MAXIMO;i++)
    {
    printf("Informe o %d%c valor do vetor - indice[%d]: ",i+1,-89,i);
    scanf("%d",&S[i]);
}

    printf("\n");
        for(i=0;i<MAXIMO;i++)
    {
    printf("o produto da variavel A pelo vetor[%d] = %d\n",i, A*S[i]);
}

        return 0;
} 

