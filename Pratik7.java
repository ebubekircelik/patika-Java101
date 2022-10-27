import java.util.Scanner;

public class Pratik7 {
    public static void main(String[] args) {
        String user, pass, newPass;
        int selection;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        user = input.nextLine();
        System.out.print("Şifre: ");
        pass = input.nextLine();

        if (user.equals("admin") && pass.equals("123")) {
            System.out.println("Giriş Başarılı!");
        } else if (user.equals("admin") && !pass.equals("123")) {
            System.out.println("Hatalı Şifre!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("1-Evet\n2-Hayır");
            System.out.print("Seçiminiz (1 / 2): ");
            selection = input.nextInt();
            if (selection == 1) {
                System.out.print("Yeni şifre: ");
                Scanner input2 = new Scanner(System.in);
                newPass = input2.nextLine();
                if (newPass.equals("123") || newPass.equals(pass)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                } else {
                    System.out.println("Şifre oluşturuldu!");
                }
            } else {
                System.out.println("İşlem sonlandırıldı.");
            }
        } else {
            System.out.println("Hatalı Giriş!");
        }
    }
}
