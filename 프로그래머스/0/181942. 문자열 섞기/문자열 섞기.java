class Solution {
    public String solution(String str1, String str2) {
        String x[] = str1.split("");
        String y[] = str2.split("");
        String result = "";
        for(int i = 0; i < x.length; i++) {
            result += x[i];
            result += y[i];
        }
        return result;
    }
}