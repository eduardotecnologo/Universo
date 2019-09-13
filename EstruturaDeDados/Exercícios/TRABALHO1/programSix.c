// 6. Faça um algoritmo que leia dois vetores: F[20] e G[20]. Calcule e mostre, a seguir, o produto
// dos valores de F por G.
#include <stdio.h>
#include <stdlib.h>
#define MAX 20  

int main(void){
    int F[MAX], G[MAX];

    for(int i = 0;i < MAX;i++){
        printf("Informe o valor do elemento %d de F: ", i);
        scanf("%d", &F[i]);
    }
    for(int i = 0;i < MAX; i++){
        printf("Informe o valor do elemento %d de G: ", i);
        scanf("%d", &G[i]);
    }
    printf("\nResultado da multiplicação\n");
    for(int i = 0; i < MAX;i++){
        printf("F[%d]xG[%d] = (%dx%d) = %d \n",i,i,F[i],G[i],F[i] * G[i]);
    }
    return 0;
}