#include <stdio.h>
#include <math.h>

int solution(int n) {
    int sqrt_n = (int)sqrt(n);
    
    if (sqrt_n * sqrt_n == n) {
        return 1;
    } else {
        return 2;
    }
}

int main() {
    int n;
    scanf("%d", &n);
    printf("%d\n", solution(n));
    return 0;
}
