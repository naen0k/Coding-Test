import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Array = new int[N];

        for (int i = 0; i < N; i++) {
            Array[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        int count = 0;

        for (int j = 0; j < N; j++) {
            if (Array[j] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}