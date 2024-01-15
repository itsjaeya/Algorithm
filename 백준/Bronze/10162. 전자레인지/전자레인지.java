import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int A = 300;
        int B = 60;
        int C = 10;
        int countA = 0, countB = 0, countC = 0;

        if (T % 10 == 0) {
            if(T / A > 0) {
                countA = T / A;
                T -= A * countA;
            }
            if (T / B > 0) {
                countB = T / B;
                T -= B * countB;
            }
            if (T / C > 0) {
                countC = T / C;
                T -= C * countC;
            }

            System.out.println(countA + " " + countB + " " + countC);
        } else {
            System.out.println("-1");
        }

    }
}
