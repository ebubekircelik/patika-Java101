import java.util.Scanner;

public class Pratik12 {
    public static void main(String[] args) {
        int n, i = 1, sum = 0, count = 0;
        double avg;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();

        while (i <= n) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                count++;
                //System.out.print(i + ",");
            }
            i++;
        }
        avg = sum / count;
        System.out.println("Toplam: " + sum);
        System.out.println("Adet: " + count);
        System.out.println("Ortalama: " + avg);
    }
}
