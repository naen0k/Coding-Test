class Solution {
    public int[] solution(int start_num, int end_num) {
        int num = end_num - start_num + 1;
        int j = 0;
        int[] answer = new int[num];
        for(int i = start_num; i <= end_num; i++) {
            answer[j] = i;
            j++;
        }      
        return answer;
    }
}