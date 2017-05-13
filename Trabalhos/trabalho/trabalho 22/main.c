#include<stdio.h>
#include<conio.h>

int main()
{
    int num,divs,rest ;
    float result;
    printf("\n\n");
    printf("  Para comecar insira um numero que possa ser divisivel por 10: ");
    scanf("%d", &num);
    divs=num/10;
    rest=num%10;

    if (rest!=0)
        {
            printf("\n\n  O numero digitado nao termina com zero !!! \n \n");
        }
    else
    {
        result=num/2;
        printf("  O resultado e: %.2f \n\n", result);
    }
return 0;
}
