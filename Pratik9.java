import java.util.Scanner;

public class Pratik9 {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsin");
        } else if (sicaklik <= 25) {
            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsin");
            }
            if (sicaklik >= 10) {
                System.out.println("Pikniğe gidebilirsin");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
