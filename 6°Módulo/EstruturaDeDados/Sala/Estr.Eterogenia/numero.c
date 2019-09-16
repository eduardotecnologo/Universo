#include <stdio.h>
#include <stdlib.h>
typedef struct numero{
    int numi;
    float numf;
}numero;
int main(){
    numero primeira,segunda;
    primeira.numi = 10;
    primeira.numf = 3.1415;
    segunda = primeira;
    printf("Os valores armazenados na segunda struct são %d e %f", segunda.numi,segunda.numf);
    return 0;
}