// Ao executar o código, o que será mostrado se forem usados os valores 4, 2 e 0 como entrada?
// a. 1 2 3 4 2 3 4 3 4 4 e 1 2 2
// b. 1 2 3 4 2 3 4 3 4 e 1 2
// c. 1 2 3 4 e 1 2
// d. 1 2 3 4; 1 2 e 0
// e. 1 2 3 4 1 2 3 1 2 1; 1 2 1 e 0
#include <stdlib.h>
#include <stdio.h>
int main(){
  int a,b,i,j;
  scanf("\n%d",&a);
  do{
    for(i = 1; i<=a; i++){
  j=i;
  while(j<=a){
    printf("\n%d",j);
    j++;
  }
}
  b=a;
  scanf("\n%d",&a);
  }
  while((a==b)||(a>=1));
}