#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;
int fn(int n);

int main() {
	int N;
	cin >> N;
	cout << fn(N) << "\n";

}
int fn(int n) {
	int min = n;
	int num;
	if (n < 3 || n > 5000) {
		return -1;
	}
	else {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (n == (3 * i + 5 * j)) {
					num = i + j;
					if (min > num) {
						min = num;
					}
				}
			}
		}

		if (min == n) {
			return -1;
		}
		else {
			return min;
		}
	}

}