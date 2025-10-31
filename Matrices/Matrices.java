package Matrices;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // Create 3 x 3 Matrix
        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of 3x3 matrix:");

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix elements are:");

        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
