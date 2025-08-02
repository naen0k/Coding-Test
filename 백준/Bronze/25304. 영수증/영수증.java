import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int a, b;
        
        for(int i = 0; i < N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a * b;
        }
        
        if(sum == X)
            System.out.print("Yes");
        else 
            System.out.print("No");
    }
}