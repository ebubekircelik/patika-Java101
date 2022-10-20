import java.util.Scanner;

public class Pratik3 {
    public static void main(String[] args) {
        int dikKenar1, dikKenar2;
        double hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Dik Kenar Uzunluğu=");
        dikKenar1 = input.nextInt();

        System.out.print("2. Dik Kenar Uzunluğu=");
        dikKenar2 = input.nextInt();

        hipotenus = Math.sqrt((dikKenar1*dikKenar1) + (dikKenar2*dikKenar2));
        System.out.println("Hipotenüs=" + hipotenus);

    }
}
