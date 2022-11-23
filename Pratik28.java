//https://app.patika.dev/courses/java101/pratik-min-max

import java.util.Arrays;
import java.util.Scanner;

public class Pratik28 {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        int inf = min;
        int sup = max;
        for (int j : list) {
            if (j < n) {
                if (j>inf) {
                    inf = j;
                }
            } else { //j > n
                if (j < sup) {
                    sup =j;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + inf);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + sup);
    }
}
