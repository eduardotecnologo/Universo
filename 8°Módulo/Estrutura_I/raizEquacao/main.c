/*8- Construa um algoritmo para calcular as raízes de uma equação do 2º grau, sendo que os
valores A, B e C são fornecidos pelo usuário.

Obs.: x = (– b +– (b2 – 4ac)1/2) / 2a*/
#include <stdio.h>
#include <stdlib.h>
#include<math.h>

main(){
  printf("Equação do 2º Grau!");

  //Variáveis a, b, c, x',x'' : real
  float a,b,c,x1,x2;

  int continua;
  continua = 1;

  while(continua){
    printf("Digite o valor de a: ");
    scanf("%f",&a);


    printf("Digite o valor de b: ");
    scanf("%f",&b);


    printf("Digite o valor de c: ");
    scanf("%f",&c);

    if( (b*b-4*a*c) >= 0){

      x1=(-b+sqrt(pow(b,2)-4*a*c))/(2*a);

      x2=(-b-sqrt(pow(b,2)-4*a*c))/(2*a);

      printf("x1 é igual a %f e x2 é igual %f\n\n",x1,x2);
    }else
      printf("Esta equacao nao possui raizes reais!\n\n");

    printf("Deseja calcular as raizes de outra equacao?\n");
    printf("digite (1) para sim e (0) para não: ");
    scanf("%d", &continua);
  }

}
