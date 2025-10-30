package Arrays;

public class MatrixDiagonalSum {

    public static int matrixDiagonalSum(int[][] matrix) {
        int size = matrix.length;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += matrix[i][i];                  // left-to-right diagonal
            secondaryDiagonalSum += matrix[i][size - 1 - i];      // right-to-left diagonal
        }

        // If matrix has odd size, middle element is counted twice → subtract once
        if (size % 2 == 1) {
            int mid = size / 2;
            secondaryDiagonalSum -= matrix[mid][mid];
        }

        return primaryDiagonalSum + secondaryDiagonalSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = matrixDiagonalSum(matrix);
        System.out.println("Sum of diagonals: " + sum);
    }
}
