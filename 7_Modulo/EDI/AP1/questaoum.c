#include <stdio.h>
#include <stdlib.h>
int main()
{
  int A, B, I, J;
  scanf("%d", &A);
  do
  {
    for (I = 1; I <= A; I++)
    {
      J = I;
      while (J <= A)
      {
        printf("%d", J);
        J++;
      }
    }
    B = A;
    scanf("%d", &A);
  } while ((A == B) || (A >= 1));
}