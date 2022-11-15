//https://app.patika.dev/courses/java101/odev-recursive-power

import java.util.Scanner;

public class Odev11 {
    static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int b = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int e = input.nextInt();

        System.out.println("Sonuç: " + power(b, e));
    }
}
