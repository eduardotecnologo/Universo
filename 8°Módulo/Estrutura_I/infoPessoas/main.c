//1- Fa�a um algoritmo para ler e em seguida exibir as seguintes informa��es de uma pessoa:
//Nome, Idade, Sexo, Peso, Altura, Profiss�o, Rua, Bairro, Cidade, Estado, CEP, Telefone.

#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define SIZE 50

char nome       [SIZE] [30];
char sexo       [SIZE] [30];
char profissao  [SIZE] [30];
char rua        [SIZE] [30];
char bairro     [SIZE] [30];
char cidade     [SIZE] [30];
char estado     [SIZE] [30];
int  idade      [SIZE];
int  cep        [SIZE];
int  telefone   [SIZE];
int  peso       [SIZE];
float altura    [SIZE];
int opcoes;

void cadastro();
void pesquisa();
void lista();

int main(void){
   // Criando um menu
   do
   {
       system("clear");
       printf("\n------MENU------\n1 - Cadastrar\n2 - Listar Todos\n3 - Pesquisar\n4 - Sair\n");
       scanf("%d", &opcoes);
       switch (opcoes)
       {
       case 1:
           cadastro();
           break;
       case 2:
            lista();
           break;
       case 3:
           pesquisa();
           break;
       case 4:
           system("exit");
           break;
       default:
       printf("\nOp��o inv�lida!");
        getchar();
        getchar();
           break;
       }
   } while (opcoes != 4 );

}
void lista(){
    int i;
    for (i = 0;i < SIZE;i++){
        if(telefone[i] > 0){
            printf("\nNome: %s\nSexo: %s\nProfiss�o: %s\nRua: %s\nBairro: %s\nCidade: %s\nEstadoo: %s\nIdade: %d\nCEP: %d\nTelefone: %d\nPeso: %d\nAltura: %f",nome[i],sexo[i],profissao[i],rua[i],bairro[i],cidade[i],estado[i],idade[i],cep[i],telefone[i],peso[i],altura[i]);
        }else{
            break;
        }
    }
    getchar();
    getchar();
}
void cadastro(){
        static int linha;
        do{
            printf("\nDigite seu nome: ");
            scanf("%s", nome[linha]);

            printf("\nDigite seu sexo: ");
            scanf("%s", sexo[linha]);

            printf("\nDigite sua profiss�o: ");
            scanf("%s", profissao[linha]);

            printf("\nDigite o nome da sua rua: ");
            scanf("%s", rua[linha]);

            printf("\nDigite o nome do seu bairro: ");
            scanf("%s", bairro[linha]);

            printf("\nDigite sua cidade: ");
            scanf("%s", cidade[linha]);

            printf("\nDigite seu estado: ");
            scanf("%s", estado[linha]);

            printf("\nDigite sua idade: ");
            scanf("%d", &idade[linha]);

            printf("\nDigite seu CEP: ");
            scanf("%d", &cep[linha]);

            printf("\nDigite seu telefone: ");
            scanf("%d", &telefone[linha]);

            printf("\nDigite seu peso:  ");
            scanf("%d", &peso[linha]);

            printf("\nDigite sua altura: Ex: 1.70 ");
            scanf("%f", &altura[linha]);

            printf("\nDigite 1 para continuar, ou qualquer valor para sair!");
            scanf("%d", &opcoes);

            linha++;
        }while ( opcoes == 1);
    }// Fim da fun��o que cadastra
    void pesquisa(){
        int telefonePesquisa; // Vari�vel auxiliar
        char profissaoPesquisa;
        int i; // Vari�vel auxiliar, percorre as linhas do vetor de Telefones
        do{
            printf("\nDigite 1 para pesquisar por Telefone ou 2 para pesquisar por Profiss�o ");
            scanf("%d", &opcoes);

            switch (opcoes)
            {
            case 1:
                printf("\nDigite o Telefone:");
                scanf("%d", &telefonePesquisa);
                for(i = 0; i < SIZE; i++){
                    if(telefone[i] == telefonePesquisa){
                       printf("\nNome: %s\nSexo: %s\nProfiss�o: %s\nRua: %s\nBairro: %s\nCidade: %s\nEstadoo: %s\nIdade: %d\nCEP: %d\nTelefone: %d\nPeso: %d\nAltura: %f",nome[i],sexo[i],profissao[i],rua[i],bairro[i],cidade[i],estado[i],idade[i],cep[i],telefone[i],peso[i],altura[i]);
                    }
                }
                break;
            case 2:
                printf("\nDigite a Profiss�o: ");
                scanf("%s", &profissaoPesquisa);
                for(i = 0; i < SIZE; i++){
                    if(strcmp(profissao[i], &profissaoPesquisa)==0){
                       printf("\nNome: %s\nSexo: %s\nProfiss�o: %s\nRua: %s\nBairro: %s\nCidade: %s\nEstadoo: %s\nIdade: %d\nCEP: %d\nTelefone: %d\nPeso: %d\nAltura: %f",nome[i],sexo[i],profissao[i],rua[i],bairro[i],cidade[i],estado[i],idade[i],cep[i],telefone[i],peso[i],altura[i]);
                    }
                }
                break;
            default:
            printf("\nOp��o inv�lida!");
                break;
            }
            printf("\nDigite 1 para continuar pesquisando! ");
            scanf("%d",&opcoes);

        }while(opcoes == 1);
    }
