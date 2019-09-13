// 3. Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos
// elementos de mesmo índice, colocando o resultado em um terceiro vetor. Mostre o vetor
// resultante.

#include <stdio.h>
#include <stdlib.h>

int main(){
    int i, vet_a[10], vet_b[10], vet_c[10];//Três vetores de 10 posições
    for(i = 0; i < 10; i++){
        printf("Insira o %d elemento do vetor 1: ",(i+1));
        scanf("%d", &vet_a[i]);
    }
    for(i = 0;i < 10; i++){
        printf("Insira o %d elemento do vetor 2: ",(i+1));
        scanf("%d", &vet_b[i]);
    }
    for(i = 0;i < 10;i++){
        vet_c[i] = vet_a[i] * vet_b[i];
        printf("%d Show!!! \nO elemento do vetor resultante é: %d", (i + 1), vet_c[i]);
    }
    return 0;
}