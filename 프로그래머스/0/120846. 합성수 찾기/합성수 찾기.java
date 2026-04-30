class Solution {
    public int solution(int n) {
        int answer = n;
        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                answer--;
                continue;
            }
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                answer--;
        }
        return answer;
    }
}