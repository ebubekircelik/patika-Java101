//https://app.patika.dev/courses/java101/pratik-palindrom

public class Pratik22 {

    static boolean isPalindrom(int N) {
        int tempN, reverseN = 0, lastDigit;
        tempN = N;
        while (tempN != 0) {
            lastDigit = tempN % 10;
            reverseN = (reverseN * 10) + lastDigit;
            tempN /= 10;
        }
        if (N == reverseN)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(9889));
    }
}
