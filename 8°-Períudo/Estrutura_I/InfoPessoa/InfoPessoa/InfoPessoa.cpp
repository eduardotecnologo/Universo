//1- Faça um algoritmo para ler e em seguida exibir as seguintes informações de uma pessoa:
// Nome, Idade, Sexo, Peso, Altura, Profissão, Rua, Bairro, Cidade, Estado, CEP, Telefone.

#include <iostream>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>



int main()
{
    char nome, sexo, profissao, rua, cidade, estado;
    int idades,cep,telefone;
    double peso, altura;

    printf("Por favor digite o nome:");
    scanf_s("%c", &nome);
    scanf_s("Digite o sexo:");
    scanf("%c", &sexo);

    //std::cout << "Hello World!\n";
    system("pause");
    return 0;
}

