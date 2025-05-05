#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* my_string) {
    int len = strlen(my_string);
    char* answer = malloc(len + 1);
    int j = 0;

    for (int i = 0; i < len; i++) {
        char c = my_string[i];
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
            answer[j++] = c;
        }
    }

    answer[j] = '\0';
    return answer;
}