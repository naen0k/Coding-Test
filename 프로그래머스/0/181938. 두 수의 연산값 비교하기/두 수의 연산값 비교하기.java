class Solution {
    public int solution(int a, int b) {
        String abstr = a+""+b;
        int ab = Integer.parseInt(abstr);
        int abc = 2*a*b;
        if(ab > abc)
            return ab;
        else if(ab < abc)
            return abc;
        else
            return ab;
    }
}