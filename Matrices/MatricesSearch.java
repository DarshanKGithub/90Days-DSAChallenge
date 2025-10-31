package Matrices;

import java.util.Scanner;

public class MatricesSearch {

    public static boolean searchElement(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println("Element found at index: (" + i + ", " + j + ")");
                    return true;
                }
            }
            // move to next row
        }
        return false;
    }

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
        searchElement(matrix, 2);
    }
    
}
