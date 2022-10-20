import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5.0, toplamTutar;
        double armutKG, elmaKG, domatesKG, muzKG, patlicanKG;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç KG Armut aldınız? = ");
        armutKG = input.nextDouble();
        System.out.print("Kaç KG Elma aldınız? = ");
        elmaKG = input.nextDouble();
        System.out.print("Kaç KG Domates aldınız? = ");
        domatesKG = input.nextDouble();
        System.out.print("Kaç KG Muz aldınız? = ");
        muzKG = input.nextDouble();
        System.out.print("Kaç KG Patlıcan aldınız? = ");
        patlicanKG = input.nextDouble();

        toplamTutar = (armutKG*armutFiyat) + (elmaKG*elmaFiyat) + (domatesKG*domatesFiyat) + (muzKG*muzFiyat) + (patlicanKG*patlicanFiyat);

        System.out.println("Toplam Tutar = " +  toplamTutar + " TL");

    }
}
