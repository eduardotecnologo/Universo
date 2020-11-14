// Considere o programa escrito em linguagem C:
// O resultado impresso será:
// Escolha uma:
// a. 147
// b. 2812
// c. 2610
// d. 1234
// e. 36912
#include <stdlib.h>
#include <stdio.h>
int main(){
  int a[][4]={1,2,3,4,5,6,7,8,9,10,11,12};
  int i;
  for(i = 0; i < 3; i++){
    printf("\n%d",*(a[i]+1));
  }
}