#include <stdio.h>

int main(void)
{
	char s[100];

	gets(s);

	printf("%d", strlen(s));

	return 0;
}