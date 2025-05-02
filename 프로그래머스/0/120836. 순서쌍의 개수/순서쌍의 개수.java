public class Solution {
    public int solution(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++; // i * (n/i) = n 이므로 순서쌍 하나 찾음
            }
        }

        return count;
    }
}