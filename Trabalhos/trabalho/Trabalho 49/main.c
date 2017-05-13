#include <stdlib.h>
#include <stdio.h>
int main(){

    int sexo,idade;
    float altura, mediaIH, cont, mediaAM, contMa;

    int i=0;
    while(i<5){
        printf("  \n\nPara comecar digite o numero:  1 p/ Feminino e 2 p/ Masculino-2: ");
        scanf("%d", &sexo);
        printf("  \n\nPor favor digite a idade: ");
        scanf("%d", &idade);
        printf("  \n\nAgora, digite a altura: ");
        scanf("%f", &altura);
        if(sexo==2){
            mediaIH = mediaIH+idade;
            contMa++;
        }else{
        if(sexo==1){
            mediaAM = mediaAM+altura;
            contMa++;
        }else{
            printf("\n\n------------------------------------------------------ \n\n");
            printf("\n                  Sexo Invalido.                     ");
            printf("\n              Nao sera contabilizado !!!              ");
            printf("\n\n------------------------------------------------------ \n\n");
        }
        }
        i++;
    }
    mediaIH = mediaIH/contMa;
    mediaAM = mediaAM/contMa;
    printf("----------------------------------------------------------------- \n \n");
    printf("A media idade dos homens: %.2f\nMedia da altura das mulheres: %.2f", mediaIH,mediaAM);
  return 0 ;
}
