class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        int coffee = money /  5500;
        int change = money % 5500;
        return new int [] {coffee, change};
    }
}