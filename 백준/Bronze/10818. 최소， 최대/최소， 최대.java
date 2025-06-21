import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N];
        for(int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }
        
        int max = Arr[0];
        int min = Arr[0];
        
        for(int i = 0; i < N; i++) {
            if(max < Arr[i]) {
                max = Arr[i];
            }
            if(min > Arr[i]) {
                min = Arr[i];
            }
        }
        
        System.out.print(min + " " + max);
    }
}