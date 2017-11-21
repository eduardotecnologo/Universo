#include <stdio.h>
#include <stdlib.h>

typedef struct numero{
    int numi;
    float numf;
}
numero;
int main(){
    numero varA,varB;
    printf("Preencher o primeiro número\n"):
    printf("Digite um valor inteiro\n"):
    scanf("%d",&varA.numi);  
    printf("Digite um valor Real\n"):
    scanf("%f",&varA.numf);
    printf("Preencher o segundo número\n"):
    printf("Digite um valor Inteiro\n");
    scanf("%d",&varB.numi);
    printf("Digite um valor Real\n");
    scanf("%f",&varB.numf);
    printf("Imprimindo o primeiro número\n");
    printf("Inteiro %d\n Real %.2f\n",varA.numi,varA.numf);
    printf("Imprimindo o segundo numero\n");
    printf("Inteiro %d\n Real%.2f", varB.numi, varB.numf);
    return 0;       
}

