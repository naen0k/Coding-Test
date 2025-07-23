class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max1) {
                max2 = max1;
                max1 = numbers[i];
            }
            else if(numbers[i] > max2)
                max2 = numbers[i];
        }
        int g = max1 * max2;
        System.out.print("두 수의 곱중 최댓 값은 "+max1+" * "+max2+" = "+g);
        return g;
    }
}