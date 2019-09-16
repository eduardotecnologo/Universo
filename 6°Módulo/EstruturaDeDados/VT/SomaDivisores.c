#include <stdio.h>
#include <stdlib.h>

void ler();
int SomaDivisores();

int main()
{
    int numero[5], num, i;
    ler(numero);
    for (i = 0; i < 5; i++)
    {
        num = numero[i];
        num = SomaDivisores(num);
        printf("\n%d", num);
    }
    return 0;
}

void ler(int numero[])
{
    int i;
    i = 0;
    do
    {
        printf("Numero: ", i + 1);
        scanf("%d", &numero[i]);
        i++;
    } while (numero[i] > 0 && i < 5);
}

int SomaDivisores(int num)
{
    int i, soma = 0;
    for (i = 1; i < num; i++)
        if (num % i == 0)
            soma += i;
    return soma;
}