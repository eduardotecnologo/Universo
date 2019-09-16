// Escreva um programa para fazer a criação dos novos tipos de dados conforme solicitado abaixo
// *Horário:composto por hora, minutos e segundos.
// *Data: composto por dia,mes e ano.
// *Compromisso: Compposto por uma data, horário e texto que descreve o compromisso.
// *Permita o usuario entrar com os dados de um compromisso e mostre somente o horário e o dia deste compromisso
#include <stdio.h>
#include <stdlib.h>

typedef struct horario
{
    int horas;
    int minutos;
    int segundos;
} horario;

typedef struct data
{
    int dia;
    int mes;
    int ano;
} data;

typedef struct compromisso
{
    char texto[200];
    data data;
    horario horario;
} compromisso;

int main()
{
    horario horario;
    data data;
    compromisso compromisso;

    printf("Hora: ");
    scanf("%d", &horario.horas);
    scanf("%d", &horario.minutos);
    scanf("%d", &horario.segundos);

    printf("\nData: ");
    scanf("%d", &data.dia);
    scanf("%d", &data.mes);
    scanf("%d", &data.ano);

    printf("Compromisso: ");
    getchar();
    gets(compromisso.texto);

    printf("\n Horario: %d:%d", horario.horas, horario.minutos);
    printf("\n Dia: %d\n", data.dia);

    return 0;
}
