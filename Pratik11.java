import java.util.Scanner;

public class Pratik11 {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean hata = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay (sayı olarak): ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz gün (sayı olarak): ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "OĞLAK";
                } else burc = "KOVA";
            } else hata = true;
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 29) {
                if (gun < 20) {
                    burc = "KOVA";
                } else burc = "BALIK";
            } else hata = true;
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 21) {
                    burc = "BALIK";
                } else burc = "KOÇ";
            } else hata = true;
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 21) {
                    burc = "KOÇ";
                } else burc = "BOĞA";
            } else hata = true;
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "BOĞA";
                } else burc = "İKİZLER";
            } else hata = true;
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23) {
                    burc = "İKİZLER";
                } else burc = "YENGEÇ";
            } else hata = true;
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "YENGEÇ";
                } else burc = "ASLAN";
            } else hata = true;
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "ASLAN";
                } else burc = "BAŞAK";
            } else hata = true;
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 23) {
                    burc = "BAŞAK";
                } else burc = "TERAZİ";
            } else hata = true;
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 23) {
                    burc = "TERAZİ";
                } else burc = "AKREP";
            } else hata = true;
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 30) {
                if (gun < 22) {
                    burc = "AKREP";
                } else burc = "YAY";
            } else hata = true;
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 31) {
                if (gun < 22) {
                    burc = "YAY";
                } else burc = "OĞLAK";
            } else hata = true;
        } else hata = true;

        if (hata) {
            System.out.println("Yanlış tarih girdiniz !");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
