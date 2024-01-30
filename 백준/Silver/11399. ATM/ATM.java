import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        Arrays.sort(P);

        for (int i = 0; i < N; i++) {
            sum += P[i] * (N - i);
        }

        System.out.println(sum);
    }
}