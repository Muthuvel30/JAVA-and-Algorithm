package Diagnal_Matrix;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int sum = 0;

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            sum += arr[i][i];
        }
        int c = col - 1;
        for (int i = 0; i < row; i++) {
            sum += arr[i][c];
            c -= 1;
        }
        if (col % 2 == 1) {
            int m = (col - 1) / 2;
            sum -= arr[m][m];
        }
        System.out.println("Sum of Matrix:" + sum);
        if (sum % 2 == 1) {
            System.out.println("Matrix Transpose");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("---------------");
            for (int i = 0; i < row; i++) {
                arr[i][i] -= sum;
            }
            int n = col - 1;
            for (int i = 0; i < row; i++) {
                arr[i][n] -= sum;
                n -= 1;
            }
            if (col % 2 == 1) {
                int k = (col - 1) / 2;
                arr[k][k] += sum;
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
