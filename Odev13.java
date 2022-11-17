//https://app.patika.dev/courses/java101/odev-recursive-pattern

import java.util.Scanner;

public class Odev13 {

    static void pattern(int n, int count, boolean flag) {
        if (n <= 0) {
            flag = false;
        }
        System.out.print(n + " ");

        if (flag) {
            pattern(n - 5, count + 1, flag);
        } else {
            if (count == 0) {
                return;
            }
            pattern(n + 5, count - 1, flag);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = input.nextInt();

        pattern(num, 0, true);
    }
}
