#include<stdio.h>
#include<conio.h>

void estacao(int dia,int mes){
    int temporada;
    if(mes <= 3){
        temporada = 2;
        if((mes == 3) && (dia >= 21))temporada = 3;
    }
    if((mes <= 6) && (mes > 3)){
        if((mes == 9) && (mes > 23))temporada = 1;
    }
    if(temporada == 1)printf("%d%dEstação Primavera",dia,mes );
    if(temporada == 2)printf("%d%dEstação Verão",dia,mes );
    if(temporada == 3)printf("%d%dEstação Outono",dia,mes );
    if(temporada == 4)printf("%d%dEstação Inverno",dia,mes );
}
int main(int arg)