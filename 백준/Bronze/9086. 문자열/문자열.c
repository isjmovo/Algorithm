#include <stdio.h>

int main(void)
{
	int T;
	char s[100];

	scanf("%d", &T);

	for (int i = 1; i <= T; i++) {
		scanf("%s", &s);

		printf("%c%c\n", s[0], s[strlen(s) - 1]);
	}

	return 0;
}