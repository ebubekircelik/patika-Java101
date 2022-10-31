//https://app.patika.dev/courses/java101/odev-artik-yil

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        int yil;
        boolean artik = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if (yil % 400 == 0) {
            artik = true;
        } else if (yil % 100 == 0) {
            artik = false;
        } else if (yil % 4 == 0) {
            artik = true;
        } else {
            artik = false;
        }

        if (artik) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}
