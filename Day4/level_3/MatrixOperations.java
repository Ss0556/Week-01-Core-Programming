import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        // Create random matrices
        int[][] matrixA = createRandomMatrix(2, 2);
        int[][] matrixB = createRandomMatrix(2, 2);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Perform matrix addition
        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Sum of A and B:");
        displayMatrix(sum);

        // Perform matrix subtraction
        int[][] difference = subtractMatrices(matrixA, matrixB);
        System.out.println("Difference of A and B:");
        displayMatrix(difference);

        // Perform matrix multiplication
        int[][] product = multiplyMatrices(matrixA, matrixB);
        System.out.println("Product of A and B:");
        displayMatrix(product);

        // Perform matrix transpose
        int[][] transposeA = transposeMatrix(matrixA);
        System.out.println("Transpose of A:");
        displayMatrix(transposeA);

        // Calculate determinant of a 2x2 matrix
        double determinantA = determinant2x2(matrixA);
        System.out.println("Determinant of A: " + determinantA);

        // Calculate inverse of a 2x2 matrix
        double[][] inverseA = inverse2x2(matrixA);
        if (inverseA != null) {
            System.out.println("Inverse of A:");
            displayMatrix(inverseA);
        } else {
            System.out.println("Matrix A is not invertible (determinant is 0).");
        }
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values between 0 and 9
            }
        }

        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.printf("%.2f ", element); // Format to 2 decimal places
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // Method to calculate the determinant of a 2x2 matrix
    public static double determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to calculate the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        double determinant = determinant2x2(matrix);

        if (determinant == 0) {
            return null; // Matrix is not invertible
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        return inverse;
    }
}