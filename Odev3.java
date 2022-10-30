//https://app.patika.dev/courses/java101/odev-ucak-bileti

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double yasOran = 1.0, gdOran = 1.0, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini seçiniz:\n1-Tek Yön\n2-Gidiş-Dönüş\nSeçiminiz: ");
        yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yolculukTipi == 1) {
                gdOran = 1;
            } else {
                gdOran = 1.6;   //0.8 * 2
            }
            if (yas < 12) {
                yasOran = 0.5;
            } else if (yas <= 24) {
                yasOran = 0.9;
            } else if (yas > 65) {
                yasOran = 0.7;
            } else {
                yasOran = 1;
            }
            toplamTutar = mesafe * 0.1 * yasOran * gdOran;
            System.out.println("Toplam Tutar: " + toplamTutar);
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
