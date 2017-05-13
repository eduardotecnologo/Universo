#include <stdio.h>
#include <stdlib.h>

int main()
{
    int prefixo, duracao;
    float precofinal1,precofinal2,precofinal3, preco1 , preco2;
    printf("\n\n");
    printf(" R$1,90 para Argentina (54), Uruguai (598), Paraguai (595), Chile (56) \n\n");
    printf(" R$2,00 para Alemanha (49), França (33), Inglaterra (44) \n\n");
    printf(" R$2,10 para Canadá e Estados Unidos (1) \n\n");
    printf(" R$2,30 para outros países. \n\n");
    printf(" ---------------------------------------------------------------------------\n\n");
    printf(" Para comecar insira o prefixo da ligacao para que eu possa calcular o preco: ");
    scanf("%d", &prefixo);

    if(prefixo == 54 || prefixo ==598 || prefixo == 595 || prefixo ==56)
    {
        printf(" \n A duracao da chamada: ");
        scanf("%d", &duracao);
        if(duracao > 300)
        {
             preco1 = duracao / 60;
             precofinal1 = preco1*1.90;
             preco2 = preco1 - 5;
             precofinal2 = (preco2*1.90)*5 /100;
             precofinal3 = precofinal1 - precofinal2;
             printf(" \n\nPreço a pagar pela ligacao e: %f", precofinal3);
        }
        else
        {
           preco1 = duracao / 60;
           precofinal1 = preco1*1.90;
           printf(" \n\nPreço a pagar pela ligacao e: %f", precofinal1);
        }
    }
    else{
        if(prefixo == 49 || prefixo== 33 || prefixo == 44)
        {
            printf("\n A duracao da chamada: ");
          scanf("%d", &duracao);
            if(duracao > 300)
            {
                 preco1 = duracao / 60;
                 precofinal1 = preco1*2.00;
                 preco2 = preco1 - 5;
                 precofinal2 = (preco2*2.00)*5 /100;
                 precofinal3 = precofinal1 - precofinal2;
                 printf(" \n\nPreço a pagar pela ligacao e: %f", precofinal3);
            }
            else
            {
               preco1 = duracao / 60;
               precofinal1 = preco1*2.00;
               printf(" \n\nPreço a pagar pela ligacao e: %f", precofinal1);
            }
        }
        else{
            if(prefixo == 1){
             printf("\n A duracao da chamada: ");
                 scanf("%d", &duracao);
                if(duracao > 300)
                {
                     preco1 = duracao / 60;
                     precofinal1 = preco1*2.10;
                     preco2 = preco1 - 5;
                     precofinal2 = (preco2*2.10)*5 /100;
                     precofinal3 = precofinal1 - precofinal2;
                     printf(" \n\nPreço a pagar pela ligacao e:  %f", precofinal3);
                }
                else
                {
                   preco1 = duracao / 60;
                   precofinal1 = preco1*2.10;
                   printf(" \n\nPreço a pagar pela ligacao e: %f", precofinal1);
                }
            }
            else{
                     printf("\n A duração da chamada: ");
                scanf("%d", &duracao);
                if(duracao > 300)
                {
                     preco1 = duracao / 60;
                     precofinal1 = preco1*2.30;
                     preco2 = preco1 - 5;
                     precofinal2 = (preco2*2.30)*5 /100;
                     precofinal3 = precofinal1 - precofinal2;
                     printf(" \n\nPreço a pagar pela ligacao e: %f", precofinal3);
                }
                else
                {
                   preco1 = duracao / 60;
                   precofinal1 = preco1*2.30;
                   printf(" \n\nPreço a pagar pela ligacao e: %f", precofinal1);
                }
                }
        }

}
    printf("\n \n \n \n");
}
