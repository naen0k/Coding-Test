class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a == b && a == c) 
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        else if(a == b && a != c)
            answer = (a+b+c)*(a*a+b*b+c*c);
        else if(c == b && a != c)
            answer = (a+b+c)*(a*a+b*b+c*c);
        else if(a == c && a != b)
            answer = (a+b+c)*(a*a+b*b+c*c);
        else
            answer = a+b+c;
        return answer;
    }
}