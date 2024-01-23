import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] s = new int[N];
        
        for(int i = 0; i < N; i++) {
            s[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 1) {
                s[b - 1] = c;
            } else if (a == 2) {
                for (int j = b; j <= c; j++) {
                    s[j - 1] = 1 - s[j - 1];
                }
            } else if (a == 3){
                for (int j = b; j <= c; j++) {
                    s[j - 1] = 0;
                }
            } else if (a == 4) {
                for (int j = b; j <= c; j++) {
                    s[j - 1] = 1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
