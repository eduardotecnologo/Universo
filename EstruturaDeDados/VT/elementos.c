#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
    int valores[10];//Variável - vetor de números inteiros, com 10 elementos.
    int indice;//Declaração cria uma variável contadora

    // A estrutura de repetição for executa 10 vezes, variando o valor de indice desde 0
    // até 9. A cada repetição, o comando scanf lê um número inteiro e o armazena no
    // indice-ésimo elemento do vetor valores. Note que tal como no scanf para
    // variáveis comuns, a referência valores[indice] se comporta como o nome de
    // uma variável comum de tipo int e é necessário precedê-la pelo símbolo &. 

    printf("Escreva 10 números inteiros: \n");
    for(indice = 0;indice < 10;indice++){
        scanf("%d", &valores[indice]);
    }
    printf("Valores em ordem Decrescente:\n");
    for(indice = 9; indice >= 0; indice--){
        printf("%d", valores[indice]);
    }
    return 0;
}