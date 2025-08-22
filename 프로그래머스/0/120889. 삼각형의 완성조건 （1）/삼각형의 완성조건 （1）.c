#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int sides[], size_t sides_len) {
    int max = 0;
    int sum = 0;

    for(int i = 0; i < sides_len; i++) {
        sum += sides[i];
        if(sides[i] > max)
            max = sides[i];
    }

    if(sum - max > max)
        return 1;
    else
        return 2;
}
