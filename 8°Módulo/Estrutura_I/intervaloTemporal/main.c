/*9- Faça um algoritmo para transformar o valor correspondente a um intervalo temporal,
expresso em horas, minutos e segundos, no valor correspondente em segundos.*/

#include <stdio.h>
#include <stdlib.h>

int convert_tempo(int,int,int);

int main()
{
    int hora, minutos, segundos,total_seg;
    printf("Por favor, digite o horário no formato HH:MM:SS: \n");
    scanf("%d%*c%d%",&hora,&minutos,&segundos);

    total_seg = convert_tempo(hora, minutos, segundos);
    printf("\nO tempo em segundos é : %d", total_seg);
}


int convert_tempo(int hora, int minuto, int segundo)
{
    int tempo = hora * 3600;
    tempo += minuto * 60;
    tempo += segundo;

    return tempo;
}
