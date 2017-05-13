#include <stdio.h>
#include <stdlib.h>

int main()
{
     float salarioIni, res, salarioAtual;
     printf("\n  Bem-Vindo a CALCULADORA DE REAJUSTE SALARIAL \n \n \n");
     printf("  Para comecar insira o seu salario mensal: ");
     scanf("%f", &salarioIni);

     if(salarioIni >= 0 && salarioIni <=1000)
     {
        res = 20;
        salarioAtual = salarioIni + (salarioIni * (res / 100));
        printf("\n\n  O seu salario novo (reajustado) = R$ %f \n \n", salarioAtual);
     }
     else{
        if(salarioIni >= 1000.01 && salarioIni <= 5000)
            {
                res = 10;
                salarioAtual = salarioIni + (salarioIni * (res / 100));
                printf("\n\nSalario novo = R$ %.2f", salarioAtual);
            }
            else
            {
                if(salarioIni >= 5000.01)
            {
                res = 0;
                salarioAtual = salarioIni + (salarioIni * (res / 100));
                printf("\n\n O novo Salario e: R$ %.2f", salarioAtual);
            }
        }
     }
return 0;
}
