import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] arrA = new int[N];
            int[] arrB = new int[M];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arrB);
            int result = 0;

            for (int j = 0; j < N; j++) {
                int first = 0;
                int end = M - 1;
                int index = 0;

                while (first <= end) {
                    int mid = (first + end) / 2;
                    if (arrB[mid] < arrA[j]) {
                        first = mid + 1;
                        index = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }

                result += index;
            }

            System.out.println(Integer.toString(result));
        }
    }
}
