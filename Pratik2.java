import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        double tutar, kdv=0.18, kdvTutar, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı Giriniz: ");
        tutar = input.nextDouble();

        kdvTutar=tutar*kdv;
        toplamTutar=tutar+kdvTutar;

        System.out.println("Tutar= " + tutar);
        System.out.println("KDV Oranı= " + kdv);
        System.out.println("KDV Tutarı= " + kdvTutar);
        System.out.println("Toplam Tutar= " + toplamTutar);

    }
}
