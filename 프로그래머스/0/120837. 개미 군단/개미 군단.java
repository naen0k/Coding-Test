class Solution {
    public int solution(int hp) {
        int n = 0;
        n += hp / 5; //장군개미
        n += (hp % 5) / 3; //병정개미
        n += (hp % 5) % 3; //일개미

        return n;
    }
}