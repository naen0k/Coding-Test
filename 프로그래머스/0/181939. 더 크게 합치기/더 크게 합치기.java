class Solution {
    public int solution(int a, int b) {
        String abstr = a + "" + b;
        int ab = Integer.parseInt(abstr);
        String bastr = b + "" + a;
        int ba = Integer.parseInt(bastr);
        
        if(ab > ba)
            return ab;
        else if(ab < ba)
            return ba;
        else
            return ab;
    }
}