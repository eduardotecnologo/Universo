/*Elaborar um algoritmo que l� um conjunto de 30 valores e os coloca em 2 vetores conforme forem
pares ou �mpares. O tamanho do vetor � de 5 posi��es. Se algum vetor estiver cheio, escrev�-lo.
Terminada a leitura escrever o conte�do dos dois vetores. Cada vetor pode ser preenchido tantas vezes quantas for necess�rio.*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    int cont, num, cont_par, cont_impar, cont_aux;
    int vet[30], vet_par[5], vet_impar[5];
    cont_par = 0;
    cont_impar = 0;
    num = 0;
    cont = 0;
    cont_aux = 0;
    for (cont = 0; cont < 30; cont++)
    {
        printf("\nDigite o número:\n");
        scanf("%d", &vet[cont]);
        system("clear"); //Limpa o console
        if (vet[cont] % 2 == 0)
        {                                  //Irá verificar se é par ou impar
            vet_par[cont_par] = vet[cont]; //Adiona a um vetor o número digitado
            cont_par++;                    //Incrementa ao contador se o número for par
            if (cont_par == 5)
            { //Irá verificar se o contador é igual a 5 para exibir
                printf("\nNúmeros pares em grupos de 5\n");
                for (cont_aux = 0; cont_aux < 5; cont_aux++)
                {
                    printf("%d\n", vet_par[cont_aux]); //Exibe os números pares usando um contador aux
                }
                cont_par = 0; //Zera o contador para poder contar até 5 os pares
            }
        }
        else
        {
            vet_impar[cont_impar] = vet[cont]; //Adiciona ao vetor o número digitado
            cont_impar++;                      //Incrementa o contador
            if (cont_impar == 5)
            { //Verificar se o contador é igual a cinco para mostrar
                printf("\nNúmeros impares em Grupos de 5:\n");
                for (cont_aux = 0; cont_aux < 5; cont_aux++)
                {
                    printf("%d\n", vet_impar[cont_aux]); //Mostra os números impares usando um contador aux
                }
                cont_impar = 0; //Zera o contador para mostrar até 5 os pares
            }
        }
    }
    printf("\nOs números digitados foram:\n");
    for (cont = 0; cont < 30; cont++)
    {
        printf("%d -", vet[cont]); //Exibe os números digitados
    }

    return 0;
}
