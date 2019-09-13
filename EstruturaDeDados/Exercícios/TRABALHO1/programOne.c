// 1. Elaborar um algoritmo que lê um conjunto de 30 valores e os coloca em 2 vetores conforme
// estes valores forem pares ou ímpares. O tamanho do vetor é de 5 posições. Se algum vetor
// estiver cheio, escrevê-lo. Terminada a leitura escrever o conteúdo dos dois vetores. Cada vetor
// pode ser preenchido tantas vezes quantas for necessário.

#include <stdio.h>
#include <stdlib.h>

int main(){
    int cont, num, cont_par, cont_impar, cont_aux;
    int vet[30],//30 valores
    vet_impar[5], //5 Posições
    vet_par[5]; //5 Posições; 

    cont_par = 0;
    cont_impar = 0;
    num = 0;
    cont = 0;
    cont_aux = 0;
    for(cont = 0;cont < 30; cont++){
        printf("Digite um Número: ");
        scanf("%d", &vet[cont]);
         system("read -p 'Precione Enter para continuar...' var");

        if(vet[cont] %2 == 0){ //Verifica se é par ou impar
            vet_par[cont_par] = vet[cont]; //Adicona a um vetor os números inputados
            cont_par++; //Add ao contador caso o número seja par
        if(cont_par == 5){ //Vai verificar se o número é igual a 5 para mostrar
            printf("Números pares em blocos de 5 números\n");
            for(cont_aux = 0; cont_aux <5; cont_aux++){
                printf("%d\n", vet_par[cont_aux]); //Exibe o número de paraes com o contador aux
                }
                cont_par = 0; //Zera o contador, retornando a contagem até 5 de números pares
            }
        } else{
            vet_impar[cont_par] = vet[cont]; //Add em um vetor o número digitado
            cont_impar++;//Incrementa o contador
            if(cont_impar == 5){//Irá verificar se o contador é igual a 5 para mostrar
                printf("Números impares no Bloco de 5 números\n");
                for(cont_aux = 0; cont_aux < 5; cont_aux++){
                    printf("%d\n", vet_impar[cont_aux]);//Exibe os números impares com o contador auxiliar
                }
                cont_impar = 0;//Zera o contador para exibir de novo
            }
        }
    }
    printf("Os números digitados foram: \n");
    for(cont = 0; cont < 30;cont++){
        printf("%d - ", vet[cont]);//Exibe os números digitados
    }
    return 0;
}