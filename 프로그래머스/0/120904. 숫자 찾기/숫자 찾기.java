class Solution {
    public int solution(int num, int k) {
        String n = String.valueOf(num);
        int idx = n.indexOf(String.valueOf(k));
        return (idx == -1) ? -1 : idx + 1;
    }
}