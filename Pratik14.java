//https://app.patika.dev/courses/java101/pratik-two-power

import java.util.Scanner;

public class Pratik14 {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1, j = 1; i <= n || j <= n; i *= 4, j *= 5) {
            System.out.print(i + " ");
            System.out.print(j + " ");
        }
    }
}
