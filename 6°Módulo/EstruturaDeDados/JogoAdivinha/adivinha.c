#include <stdio.h>
#include <stdlib.h>

int main(){
    printf("********************************\n");
    printf("Bem Vindo ao Jogo de Adivinhação\n");
    printf("********************************\n");

    int chute;
    printf("Qual é o chute?\n");
    scanf("%d", &chute);
    printf("Voce chutou o número %d\n", chute);

    printf("Parabéns, você acertou!!!\n");
    printf("Que pena manolo, você Errou!!\n");
}
