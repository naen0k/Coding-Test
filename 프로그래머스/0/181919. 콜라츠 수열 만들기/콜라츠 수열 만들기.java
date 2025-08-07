class Solution {
    public int[] solution(int n) {
        int[] temp = new int[1000];
        int idx = 0;
        
        while(true) {
            temp[idx++] = n;
            if(n == 1) break;
            else if(n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
        }
        int answer[] = new int[idx];
        for(int i = 0; i < idx; i++)
            answer[i] = temp[i];
        return answer;
    }
}