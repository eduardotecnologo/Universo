#include<stdio.h>
#include<math.h>
	int main(int argc, char const *argv[])
	{
		printf("        Seja bem vindo ao simulador de créditos!         \n");
		printf("*******   De 0 a 200, nenhum crédito no momento  *******\n");
		printf("******* De 201 a 400 20%% do valor do saldo médio *******\n");
		printf("******* De 401 a 600 30%% do valor do saldo médio *******\n");
		printf("******* Acima de 601 40%% do valor do saldo médio *******\n\n");
		printf("Digite seu Saldo Médio do Ultimo ano:\n");
		float saldo, credito;
			scanf("%f", &saldo);
			if (saldo >= 0 && saldo <= 200)
				credito = 0;
			if (saldo > 200 && saldo <= 400)
			credito = saldo * 0.20;
			if(saldo > 400 && saldo <= 600)
				credito = saldo * 0.30;
			if(saldo > 600)
				credito = saldo * 0.40;
			printf("Saldo médio = R$%.2f\nValor do crédito epecial = R$%.2f\n", saldo, credito);
			printf("Volte sempre!\n");
		return 0;
	}
