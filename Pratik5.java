import java.util.Scanner;

public class Pratik5 {
    public static void main(String[] args) {
        int yariCap, merkezAci=360;
        double pi=3.14, cevre, alan, dilimAlan;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire yarıçapı= ");
        yariCap = input.nextInt();

        System.out.print("Daire dilimi merkez açısı= ");
        merkezAci = input.nextInt();

        cevre = 2 * pi * yariCap;
        alan = pi * yariCap * yariCap;

        dilimAlan = alan * (merkezAci/360.0);

        System.out.println("Dairenin Çevresi= " +  cevre);
        System.out.println("Dairenin Alanı= " +  alan);
        System.out.println("Dairenin Diliminin Alanı= " +  dilimAlan);

    }
}
