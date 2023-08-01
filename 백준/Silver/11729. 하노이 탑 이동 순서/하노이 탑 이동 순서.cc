#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
void Hanoi(int num, char A, char B, char C);
void H(int num, char A, char B, char C);
int count;
int main() {
	int a;
	scanf("%d", &a);
	Hanoi(a, '1', '2', '3');
	printf("%d\n", count);
	H(a, '1', '2', '3');

	return 0;
}

void Hanoi(int num, char A, char B, char C) {

	if (num == 1) {
		count++;
	}
	else {
		Hanoi(num - 1, A, C, B);
		Hanoi(num - 1, B, A, C);
		count++;
	}

}

void H(int num, char A, char B, char C) {

	if (num == 1) {
		printf("%c %c\n", A, C);
	}
	else {
		H(num - 1, A, C, B);
		printf("%c %c\n", A, C);
		H(num - 1, B, A, C);
	}
}