class Solution {
    public int solution(int[] array) {
        int[] count = new int[1001];

        // 1. 등장 횟수 세기
        for (int num : array) {
            count[num]++;
        }

        int max = 0;
        int answer = -1;

        // 2. 최빈값 찾기
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
            } else if (count[i] == max && max != 0) {
                answer = -1;
            }
        }

        return answer;
    }
}