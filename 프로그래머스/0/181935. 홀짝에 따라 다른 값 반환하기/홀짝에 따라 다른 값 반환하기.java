class Solution {
    public int solution(int n) {
        int sum = 0;
        int jgs = 0;
        if(n % 2 == 1) {
            for(int i = 0; i <= n; i++) {
                if(i % 2 == 1) 
                    sum += i;
            }
        }
        else if(n % 2 == 0) {
            for(int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    jgs = i * i;
                    sum += jgs;
                }
            }
        }
        return sum;
    }
}