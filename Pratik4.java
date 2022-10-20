import java.util.Scanner;

public class Pratik4 {
    public static void main(String[] args) {
        int mesafe;
        double kmUcret=2.2, toplamUcret;

        Scanner input = new Scanner(System.in);

        System.out.print("Toplam mesafeyi giriniz (km): ");
        mesafe = input.nextInt();

        toplamUcret = 10 + (mesafe*kmUcret);

        toplamUcret = toplamUcret<20 ? 20 : toplamUcret;

        System.out.println("Toplam Ücret: " +  toplamUcret);

    }
}
