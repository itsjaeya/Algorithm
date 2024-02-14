import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] weight = new Integer[N];

        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
        }

        Arrays.sort(weight, Comparator.reverseOrder());

        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum = weight[i] * (i + 1);
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
