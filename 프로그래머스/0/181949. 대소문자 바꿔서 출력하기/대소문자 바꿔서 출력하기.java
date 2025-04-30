import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 문자열 길이 제한 확인 (문제 조건 만족 여부 체크)
        if (str.length() < 1 || str.length() > 20) {
            System.out.println("문자열 길이는 1 이상 20 이하여야 합니다.");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 문제 조건상 알파벳만 들어오므로 아래 조건만 사용해도 됨
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(result.toString());
    }
}
