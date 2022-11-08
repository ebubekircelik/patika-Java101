//https://app.patika.dev/courses/java101/odev-ters-ucgen

import java.util.Scanner;

public class Odev8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int n = input.nextInt();

        for (int x = n; x >= 1; x--) {
            for (int y = (n - x); y >= 1; y--) {
                System.out.print(" ");
            }
            for (int z = (2 * x) - 1; z >= 1; z--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
