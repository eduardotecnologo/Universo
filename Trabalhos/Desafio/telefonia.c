#include <stdio.h>
#include <math.h>
	int main(int argc, char const *argv[])
	{
		int pref, time;
		float price_end1,price_end2,price_end3,price1,price2;
		printf("\n\n");
		printf("      *####* Bem vindo a central de telefonia Internacional*####*\n ");
		printf("         ---------------------------------------------------\n");
		printf("      **--** Escolha o prefixo referente ao paíz de destino **--**\n\n");
	    printf(" 	        (49) Alemanha - (33) França - (44) Inglaterra\n");
	    printf("                   O Valor de cada minuto é R$ 2,00 \n");
	    printf(" --------------------------------------------------------------------\n");
	    printf("    (54) Argentina - (598) Uruguai - (595) Paraguai - (56) Chile\n");
	    printf("                   O Valor de cada minuto é R$ 1,90 \n");
	    printf(" --------------------------------------------------------------------\n");
	    printf("                      (1) Canadá - Estados Unidos\n");
	    printf("                    O Valor de cada minuto é R$ 2,10 \n\n");
	    printf("                        Para outros países R$2,30 \n");
	    printf(" --------------------------------------------------------------------\n");
	    printf("      Insira o prefixo desejado para calcular o preço da ligação:\n");
	    printf("Prefixo: ");
	    scanf("%d", &pref);

       //Prefixos (54) Argentina - (598) Uruguai - (595) Paraguai - (56) Chile, 1.90 minuto
	    if (pref == 54 || pref ==598 || pref == 595 || pref ==56)
	    {
	    	printf(" \nDuração da chamada? ");
        	scanf("%d", &time);
        if(time > 300){
             price1 = time / 60;
             price_end1 = price1*1.90;
             price2 = price1 - 5;
             price_end2 = (price2*1.90)*5 /100;
             price_end3 = price_end1 - price_end2;
             printf(" \n\nTotal a pagar: %.2f", price_end3);
	    }else{
	    		price1 = time / 60;
	            price_end1 = price1*1.90;
	            printf(" \n\nTotal a pagar: %.2f", price_end1);
	    }
	}else{
        if(pref == 49 || pref== 33 || pref == 44)
        {
            printf("\nDuração da chamada? ");
          scanf("%d", &time);
            if(time > 300)
            {
                 price1 = time / 60;
                 price_end1 = price1*2.00;
                 price2 = price1 - 5;
                 price_end2 = (price2*2.00)*5 /100;
                 price_end3 = price_end1 - price_end2;
                 printf(" \n\nPreço a pagar pela ligacão e: %.2f", price_end3);
            }
            else
            {
               price1 = time / 60;
               price_end1 = price1*2.00;
               printf(" \n\nPreço a pagar pela ligacão e: %f", price_end1);
            }
        }
        else{
            if(pref == 1){
             printf("\nDuração da chamada? ");
                 scanf("%d", &time);
                if(time > 300)
                {
                     price1 = time / 60;
                     price_end1 = price1*2.10;
                     price2 = price1 - 5;
                     price_end2 = (price2*2.10)*5 /100;
                     price_end3 = price_end1 - price_end2;
                     printf(" \n\nPreço a pagar pela ligacão é:  %.2f", price_end3);
                }
                else
                {
                   price1 = time / 60;
                   price_end1 = price1*2.10;
                   printf(" \n\nPreço a pagar pela ligacão é: %.2f", price_end1);
                }
            }
            else{
                     printf("\nDuração da chamada? ");
                scanf("%d", &time);
                if(time > 300)
                {
                     price1 = time / 60;
                     price_end1 = price1*2.30;
                     price2 = price1 - 5;
                     price_end2 = (price2*2.30)*5 /100;
                     price_end3 = price_end1 - price_end2;
                     printf(" \n\nPreço a pagar pela ligacão é: %.2f", price_end3);
                }
                else
                {
                   price1 = time / 60;
                   price_end1 = price1*2.30;
                   printf(" \n\nPreço a pagar pela ligacão é: %.2f", price_end1);
                }
                }
        }
}
    printf("\n \n Obrigado!!!");
}