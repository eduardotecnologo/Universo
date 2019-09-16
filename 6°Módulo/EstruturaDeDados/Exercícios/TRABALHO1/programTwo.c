// 2. Faça um algoritmo que leia um vetor N[20]. A seguir, encontre o menor elemento do vetor N
// e a sua posição dentro do vetor, mostrando: “O menor elemento de N é”, M, “e sua posição
// dentro do vetor é:”,P.

/*Eduardo Developer*/

#include <stdio.h>
#include <stdlib.h>

int main(){
    int n[20];//Vetor de 20 posições
    int i, menor = 9999, position;
    for(i = 0; i < 20; i++){
        printf("\nDigite um número: ");
        scanf("%d", &n[i]);
        if(n[i] < menor){
            menor = n[i];
            position = i;
        }
    }
    printf("\n O menor elemento é o %d, na posição %d manolo", menor, position);
    return 0;  
}
