//https://app.patika.dev/courses/java101/pratik-ebob-ekok

import java.util.Scanner;

public class Pratik21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, min;
        int ebob = 1, ekok;

        System.out.print("Birinci sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        if (n1 <= n2) {
            min = n1;
        } else {
            min = n2;
        }
        //System.out.println(min);

        while (min >= 1) {
            if (n1 % min == 0 && n2 % min == 0) {
                ebob = min;
                break;
            }
            min--;
        }
        //System.out.println(min);
        System.out.println("EBOB(" + n1 + "," + n2 + ")="+ebob);
        ekok = (n1*n2)/ebob;
        System.out.println("EKOK(" + n1 + "," + n2 + ")="+ekok);
    }
}
