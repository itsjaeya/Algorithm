import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int count = 1;
        int result = 0;

        while(true) {
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();

            if(L == 0 && P == 0 && V == 0) {
                break;
            }

            if(L <= V % P) {
                result =  V / P * L + L;
            } else {
                result =  V / P * L + V % P;
            }

            sb.append("Case " + count + ": " + result + "\n");

            count++;
        }
        System.out.print(sb);
    }
}
