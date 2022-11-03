//https://app.patika.dev/courses/java101/pratik-armstrong-1

import java.util.Scanner;

public class Pratik17 {
    public static void main(String[] args) {
        int N, b, tempN;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        N = input.nextInt();

        tempN = N;

        while (tempN != 0) {
            b = tempN % 10;
            //System.out.println(b);
            total += b;
            tempN /= 10;
        }
        System.out.println(N + " sayısının basamak sayılarının toplamı: " + total);
    }
}
