import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 0;
        int diff1 = 0;
        int diff2 = 0;

        for (int i = 0; i < 10; i++) {
            arr[i]  = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            sum += arr[i];
            if (sum >= 100) {
                diff1 = 100 - (sum - arr[i]);
                diff2 = sum - 100;
                if (diff1 >= diff2) {
                    System.out.println(sum);
                } else {
                    System.out.println(sum - arr[i]);
                }
                break;
            }
        }

        if (sum < 100) {
            System.out.println(sum);
        }
    }
}