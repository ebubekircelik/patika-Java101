//https://app.patika.dev/courses/java101/odev-mukemmel-sayi

import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        int n, sum;
        Scanner input = new Scanner(System.in);
        while (true) {
            sum = 0;
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n && n != 0) {
                System.out.println(n + " Mükemmel sayıdır.");
            } else {
                System.out.println(n + " Mükemmel sayı değildir.");
            }
        }
    }
}
