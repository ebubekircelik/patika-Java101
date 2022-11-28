//https://app.patika.dev/courses/java101/odev-array-order

import java.util.Arrays;
import java.util.Scanner;

public class Odev15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1) + ". Elemanı : ");
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);
        System.out.print("Sıralama : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
