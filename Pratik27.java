//https://app.patika.dev/courses/java101/pratik-array-ortalama

public class Pratik27 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        double harmonicSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                harmonicSum += (1.0 / numbers[i]);
            }
        }
        //System.out.println(harmonicSum);

        double harmonicAvg = numbers.length / harmonicSum;

        System.out.println(harmonicAvg);
    }
}
