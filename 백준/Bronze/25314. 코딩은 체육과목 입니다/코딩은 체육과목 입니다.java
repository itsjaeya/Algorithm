import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (i % 4 == 0) {
                cnt++;
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.print("long ");
        }

        System.out.println("int");
    }
}
