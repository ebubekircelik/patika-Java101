package Minesweeper;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    int rowNum;
    int colNum;
    int mineNum;
    String[][] fieldVisible;
    String[][] fieldHidden;

    Minesweeper(int rowNum, int colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.fieldVisible = new String[rowNum][colNum];
        this.fieldHidden = new String[rowNum][colNum];
        this.mineNum = (rowNum * colNum) / 4;
    }

    public void setFields() {
        Random rnd = new Random();
        int randRow;
        int randCol;
        for (int i = 0; i < mineNum; i++) {
            randRow = rnd.nextInt(rowNum);
            randCol = rnd.nextInt(colNum);
            if (fieldHidden[randRow][randCol] != "*") {
                fieldHidden[randRow][randCol] = "*";
            } else {
                i--;
            }
        }
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                fieldVisible[i][j] = "-";
                if (fieldHidden[i][j] != "*") {
                    fieldHidden[i][j] = "-";
                }
            }
        }
    }

    void getVisibleField() {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.print(fieldVisible[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=================================");
    }

    void getHiddenField() {
        System.out.println("Mayınların Konumu:");
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.print(fieldHidden[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=================================");
    }

    void getResultField() {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (fieldHidden[i][j] != "*"){
                    System.out.print(fieldVisible[i][j] + " ");
                } else {
                    System.out.print(fieldHidden[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("=================================");
    }

    void run() {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        int totalMove = rowNum * colNum - mineNum;

        setFields();

        //getHiddenField();
        //System.out.println("totalMove = " + totalMove);
        //System.out.println("mineNum = " + mineNum);

        System.out.println("Mayın Tarlası - Oyuna Hoş Geldiniz !");

        while (totalMove > 0) {
            System.out.print("X Koordinatı Giriniz : ");
            row = input.nextInt();
            System.out.print("Y Koordinatı Giriniz : ");
            col = input.nextInt();

            if ((row < 0 || row >= rowNum) || (col < 0 || col >= colNum)) {
                System.out.println("Geçersiz Koordinat !");
                continue;
            }
            if (fieldHidden[row][col] == "*") {
                System.out.println("Kaybettiniz :(");
                getResultField();
                break;
            } else {
                if (fieldVisible[row][col] != "-") {
                    System.out.println("Daha Önce Seçilmiş Koordinat !");
                    //System.out.println("totalMove = " + totalMove);
                    totalMove++;
                } else {
                    int count = 0;
                    if (fieldHidden[row][col] != "*") {
                        if (row != 0) {
                            if (fieldHidden[row - 1][col] == "*") count++;
                            if (col != 0)
                                if (fieldHidden[row - 1][col - 1] == "*") count++;

                        }
                        if (row != rowNum - 1) {
                            if (fieldHidden[row + 1][col] == "*") count++;
                            if (col != colNum - 1)
                                if (fieldHidden[row + 1][col + 1] == "*") count++;

                        }
                        if (col != 0) {
                            if (fieldHidden[row][col - 1] == "*") count++;
                            if (row != rowNum - 1)
                                if (fieldHidden[row + 1][col - 1] == "*") count++;

                        }
                        if (col != colNum - 1) {
                            if (fieldHidden[row][col + 1] == "*") count++;
                            if (row != 0)
                                if (fieldHidden[row - 1][col + 1] == "*") count++;

                        }

                        fieldVisible[row][col] = Integer.toString(count);
                    }
                }
            }
            totalMove--;
            getVisibleField();
        }
        if (totalMove == 0) {
            System.out.println("Tebrikler :)");
            getResultField();
        }
        input.close();
    }
}
