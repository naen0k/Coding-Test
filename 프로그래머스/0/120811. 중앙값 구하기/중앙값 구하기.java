import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        if (array.length % 2 == 0) {
            throw new IllegalArgumentException ("배열의 길이는 홀수여야 합니다.");
        }
        Arrays.sort(array);
        return array[array.length / 2];
    }
}