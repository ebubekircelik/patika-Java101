//https://app.patika.dev/courses/java101/odev-recursive-prime

import java.util.Scanner;

public class Odev12 {
    static boolean isPrime(int n, int i) {

        if (n == 2)
            return true;
        if (n <= 1 || n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int num = input.nextInt();

        if (isPrime(num, 2))
            System.out.println(num + " sayısı ASALDIR !");
        else
            System.out.println(num + " sayısı ASAL değildir !");
    }
}
