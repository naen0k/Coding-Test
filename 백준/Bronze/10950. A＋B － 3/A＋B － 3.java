import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A;
        int B;
        
        for(int i = 0; i < N; i++) {
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}