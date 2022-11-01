//https://app.patika.dev/courses/java101/pratik-tek-sayi-toplam

import java.util.Scanner;

public class Pratik13 {
    public static void main(String[] args) {
        int n, sum = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                sum += n;
            }
        } while (n % 2 == 0);

        System.out.println("Toplam: " + sum);
    }
}
