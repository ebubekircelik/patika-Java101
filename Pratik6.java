import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Pratik6 {
    public static void main(String[] args) {
        int num1, num2, islem;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayı= ");
        num1 = input.nextInt();

        System.out.print("İkinci sayı= ");
        num2 = input.nextInt();

        System.out.println("İşlemi seçiniz:");
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem=");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama: " + (num1+num2));
                break;
            case 2:
                System.out.println("Çıkartma: " + (num1-num2));
                break;
            case 3:
                System.out.println("Çarpma: " + (num1*num2));
                break;
            case 4:
                if (num2 != 0){
                    System.out.println("Bölme: " + (num1/num2));
                } else {
                    System.out.println("0'a BÖLÜNME HATASI !");
                }
                break;
            default:
                System.out.println("HATALI İŞLEM SEÇİMİ !");
        }
    }
}
