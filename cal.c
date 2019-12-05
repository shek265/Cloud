#include <stdio.h>
int main()
{
  int x, y, z,a,b,c;

  printf("Enter two numbers to add\n");
  scanf("%d%d", &x, &y);

  z = x + y;
a=x-y;
b=x*y;
c=x/b;

  printf("Sum of the numbers = %d\n", z);
  printf("Sub of the numbers = %d\n", a);
  printf("mul of the numbers = %d\n", b);
  printf("div of the numbers = %d\n", c);

  return 0;
}
