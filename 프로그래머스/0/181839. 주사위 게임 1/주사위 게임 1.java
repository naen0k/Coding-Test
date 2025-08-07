class Solution {
    public int solution(int a, int b) {
        int answer;
        if (a % 2 != 0 && b % 2 != 0) {
            answer = (a * a) + (b * b);
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = a > b ? a - b : b - a;
        } else {
            answer = 2 * (a + b);
        }
        return answer;
    }
}