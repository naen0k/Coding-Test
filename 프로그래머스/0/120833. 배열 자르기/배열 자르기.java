import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 배열의 크기를 num2 - num1 + 1로 설정
        int[] answer = new int[num2 - num1 + 1];
        
        // 배열의 num1부터 num2까지 자르기 (num2 + 1을 사용하여 num2 포함)
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        return answer;
    }
}
