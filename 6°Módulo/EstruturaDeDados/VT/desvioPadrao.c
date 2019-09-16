#include <stdio.h>
#include <math.h>

#define numeros 10
double media(double s[], int n)
{
    double sum = 0.0;
    int i = 0;

    for (i = 0; i < n; i++)
        sum += s[i];

    return sum / n;
}
//Calculando a variança
double variancia(double s[], int n)
{
    double sum = 0.0;
    double dev = 0.0;
    double med = media(s, n);
    int i = 0;

    for (i = 0; i < n; i++)
    {
        dev = s[i] - med;
        sum += (dev * dev);
    }

    return sum / n;
}
//Calculando o Desvio Padrão
double desvio_padrao(double s[], int n)
{
    double v = variancia(s, n);
    return sqrt(v);
}

int main(void)
{
    double vetor[numeros];
    int i;

    for (i = 0; i < numeros; i++)
    {
        printf("Digite um numero: ");
        scanf("%lf", &vetor[i]);
    }

    printf("Media = %g\n", media(vetor, numeros));
    printf("Desvio Padrao = %g\n", desvio_padrao(vetor, numeros));

    return 0;
}