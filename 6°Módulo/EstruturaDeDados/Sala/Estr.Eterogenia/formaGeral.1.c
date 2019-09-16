

// forma Geral
struct nome_da_estrutura{
    tipo_1 nome_1;
    tipo_2 nome_2;
    .
    .
    tipo_n nome_n;
}
// 
struct numero{
    int numi;
    float numf;
}
int main(){
    struct numero varA,varB;
    return 0;
}
// ALternativa
 typedef struct nome_da_estrutura{
    tipo_1 nome_1;
    tipo_2 nome_2;
    .
    .
    tipo_n nome_n;
  }//Novo nome da variável

//   Ex
typedef struct numero{
    int numi;
    float numf;
}
numero;
int main(){
    numero varA,varB;
    return 0;
}
