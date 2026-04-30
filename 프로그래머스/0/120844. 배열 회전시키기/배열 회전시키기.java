class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int temp = numbers[numbers.length -1];
        if(direction.equals("right")) {     
            for(int i = 1; i < numbers.length; i++)
                answer[i] = numbers[i-1];
            answer[0] = temp;
        } else {
            temp = numbers[0];
            for(int i = numbers.length - 1; i > 0; i--)
                answer[i - 1] = numbers[i];
            answer[answer.length-1] = temp;
        }
        return answer;
    }
}