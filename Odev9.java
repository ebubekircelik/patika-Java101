//https://app.patika.dev/courses/java101/odev-asal-sayi

import java.util.Scanner;

public class Odev9 {
    public static void main(String[] args) {

        int n = 100, count;

        for (int i = 1; i <= n; i++) {

            count = 0;

            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
