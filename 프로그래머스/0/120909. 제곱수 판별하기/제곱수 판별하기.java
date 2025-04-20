class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        int answer = 0;
        
        if ( sqrt * sqrt == n) {
            answer = 1;
        }
        else {
            answer = 2;
        }
        
        return answer;
    }
}