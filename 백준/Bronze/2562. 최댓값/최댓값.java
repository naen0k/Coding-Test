import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr[] = new int[9];
        for(int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }
        int max = Arr[0];
        int index = 0;
        for(int i = 0; i < Arr.length; i++) {
            if (max < Arr[i]) {
                max = Arr[i];
               index = i;
            }
        }
        System.out.println(max);
        System.out.print(index + 1);
    }
}