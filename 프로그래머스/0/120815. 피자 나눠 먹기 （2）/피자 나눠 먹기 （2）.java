class Solution {
    public int solution(int n) {
        int allsc = 6;
        int pizza = 1;
        while (allsc % n != 0) {
            if(allsc % n != 0) {
                allsc += 6;
                pizza += 1;
            }
            else 
                break;
        }
        return pizza;
    }
}