#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i;
    float base,altura,area;
    i=0;
    while(i < 50){
        printf("\n Por favor insira a base do triangulo: ");
        scanf("%f", &base);
        printf(" Agora, insira a altura do triangulo: ");
        scanf("%f", &altura);
        area = (base * altura)/2;
        printf("\n A area total do triangulo e: %f \n \n", area);
        printf("-------------------------------------------------------");
        i++;
    }

}
