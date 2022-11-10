//https://app.patika.dev/courses/java101/odev-fibo

import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {

        int N, n1 = 0, n2 = 1, n3;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısı giriniz : ");
        N = input.nextInt();

        System.out.print(N + " Elemanlı Fibonacci Serisi : ");

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < N; i++)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
