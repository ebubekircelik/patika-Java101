import java.util.Scanner;

public class Pratik8 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, dersAdet = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
            dersAdet = dersAdet - 1;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            dersAdet = dersAdet - 1;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            dersAdet = dersAdet - 1;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            dersAdet = dersAdet - 1;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            dersAdet = dersAdet - 1;
        }
        if (dersAdet > 0) {
            int toplam = mat + fizik + kimya + turkce + muzik;
            double ortalama = toplam / dersAdet;
            //System.out.println("Toplam=" + toplam);
            //System.out.println("Ders Adet=" + dersAdet);
            System.out.println("Not Ortalamanız: " + ortalama);

            if (ortalama >= 55) {
                System.out.println("Sınıfı Geçtiniz :)");
            } else {
                System.out.println("Sınıfta Kaldınız :(");
            }
        } else {
            System.out.println("Tüm notları hatalı girdiniz!");
        }
    }
}
