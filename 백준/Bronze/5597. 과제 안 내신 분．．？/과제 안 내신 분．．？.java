import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentNo = new int[30];

        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            studentNo[n - 1] = n;
        }

        for (int i = 0; i < 30; i++) {
            if(studentNo[i] != (i + 1)) {
                System.out.println(i + 1);
            }
        }

    }
}