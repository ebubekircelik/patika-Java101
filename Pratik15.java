//https://app.patika.dev/courses/java101/pratik-faktoriyel

import java.util.Scanner;

public class Pratik15 {
    public static void main(String[] args) {
        int n, r, k, nTotal = 1, rTotal = 1, kTotal = 1, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon hesaplaması için sayıları giriniz:\nC(n,r)");

        System.out.print("n= ");
        n = input.nextInt();
        System.out.print("r= ");
        r = input.nextInt();

        k = n - r;

        for (int i = 1; i <= n; i++) {
            nTotal *= i;
        }
        for (int i = 1; i <= r; i++) {
            rTotal *= i;
        }
        for (int i = 1; i <= k; i++) {
            kTotal *= i;
        }

        c = nTotal / (rTotal * kTotal);
        System.out.println("C(" + n + "," + r + ")=" + c);
    }
}
