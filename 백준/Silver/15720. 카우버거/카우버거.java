import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        Integer[] burger = new Integer[B];
        Integer[] side = new Integer[C];
        Integer[] beverage = new Integer[D];
        int originalTotal = 0;
        int discountTotal = 0;

        int min = B;
        if (C < min) {
            min = C;
        }
        if (D < min) {
            min = D;
        }

        for (int i = 0; i < B; i++) {
            burger[i] = sc.nextInt();
            originalTotal += burger[i];
        }
        Arrays.sort(burger, Collections.reverseOrder());
        for (int i = 0; i < C; i++) {
            side[i] = sc.nextInt();
            originalTotal += side[i];
        }
        Arrays.sort(side, Collections.reverseOrder());
        for (int i = 0; i < D; i++) {
            beverage[i] = sc.nextInt();
            originalTotal += beverage[i];
        }
        Arrays.sort(beverage, Collections.reverseOrder());

        for (int i = 0; i < min; i++) {
            int sum = burger[i] + side[i] + beverage[i];
            discountTotal += sum * 0.9;
        }
        for (int i = min; i < B; i++) {
            discountTotal += burger[i];
        }
        for (int i = min; i < C; i++) {
            discountTotal += side[i];
        }
        for (int i = min; i < D; i++) {
            discountTotal += beverage[i];
        }

        System.out.println(originalTotal);
        System.out.println(discountTotal);
    }
}
