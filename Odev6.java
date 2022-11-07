//https://app.patika.dev/courses/java101/odev-min-max

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        int n, num, min=0, max=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            num = input.nextInt();
            if (i == 1) {
                min = num;
                max = num;
            } else {
                if (num <= min) {
                    min = num;
                } else {
                    max = num;
                }
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
