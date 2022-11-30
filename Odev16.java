//https://app.patika.dev/courses/java101/odev-array-count

import java.util.Arrays;

public class Odev16 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] distinctArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                distinctArr[index] = arr[i];
                index++;
            }
        }
        //System.out.println(Arrays.toString(distinctArr));

        for (int i = 0; i < index; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (distinctArr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
        }

    }
}
