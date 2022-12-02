//https://app.patika.dev/courses/java101/odev-array-transpose

import java.util.Scanner;

public class Odev17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("# of rows: ");
        int row = scanner.nextInt();
        System.out.print("# of cols: ");
        int col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("matrix[" + i + "][" + j + "]=");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transpose = new int[col][row];
        System.out.println("Transpose:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
