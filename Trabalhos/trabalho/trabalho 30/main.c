#include<stdio.h>
#include<conio.h>

int main()
{
    int num1, num2, res2, cod;
    float res3;

    printf("Para comecar insira um numero: ");
    scanf("%d", &num1);
    printf("Agora insira um outro numero: ");
    scanf("%d", &num1);
    printf("Para continuar insira um codigo de selecao dos usuarios 1 a 3: ");
    scanf("%d", &cod);

    if (cod==1)
    {
        printf("O resultado e: %d%d", num1, num2);
    }else
        {
            if (cod==2)
            {
                res2=num1*num2;
                printf("O resultado e: %d", res2);
            }else
            {
                if(cod==3)
                {
                    res3=num1/num2;
                    printf("O resultado e: %.2f \n \n ", res3);
                }else
                {
                printf("Codigo invalido, Por favor insira um codigo valido !!!");
                }
            }
        }
        return 0;
}
