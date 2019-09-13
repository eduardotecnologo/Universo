// // 4. Faça um algoritmo que leia um vetor K[30]. Troque a seguir, todos os elementos de ordem
// ímpar do vetor com os elementos de ordem par imediatamente posteriores.

#include <stdio.h>
#include <stdlib.h>

int main(){
    int i, aux, vet_k[30];
    for(i = 0;i < 30;i++){
        printf("\nvet_k[%d] = ",i);
        scanf("%d",&vet_k[i]);
        }
        for(i = 0;i < 29;i++){
            aux = vet_k[i];
            vet_k[i] = vet_k[i + 1];
            vet_k[i + 1] = aux;
        printf("\n\n\n");
        for(i = 0;i < 30;i++){
            printf("\n[%d] = %d",i,vet_k[i]);
        }
    }
    return 0;
}