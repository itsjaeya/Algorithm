import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int cnt = 0;
        boolean isOnly;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i = 0; i < 10; i++) {
            isOnly = false; // 여기서 매번 false로 초기화해줘야 함.
            for (int j = i + 1; j < 10; j++) { // j = 0; j < i; j++ 로 해서 틀렸음
                if (arr[i] == arr[j]) {
                    isOnly = true;
                    break;
                }
            }

            if (isOnly == false) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}