class Solution {
    public int solution(int[] numbers, int k) {
        int i = 0;
        for (int cnt = 1; cnt < k; cnt++) {
            i += 2;
            if (i >= numbers.length) {
                i %= numbers.length; 
            }
        }
        return numbers[i];
    }
}