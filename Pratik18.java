import java.util.Scanner;

public class Pratik18 {
    public static void main(String[] args) {
        int n;
        double sum = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.printf("Sayı giriniz: ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            sum += (1/i);
        }
        System.out.println(sum);
    }
}
