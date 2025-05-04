class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 공통 분모 계산
        int commonDenom = denom1 * denom2;

        // 2. 분자끼리 공통 분모에 맞춰서 합치기
        int sumNumer = numer1 * denom2 + numer2 * denom1;

        // 3. 최대공약수 구해서 약분
        int gcd = getGCD(sumNumer, commonDenom);

        // 4. 분자 분모를 최대공약수로 나눠서 기약분수 만들기
        int[] answer = {sumNumer / gcd, commonDenom / gcd};
        return answer;
    }

    // 최대공약수 구하는 함수 (유클리드 호제법)
    public int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
