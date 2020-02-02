public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{2, -3, 1}, {5, 4, -2}};
        int[][] matrix2 = new int[][]{{-7, 5}, {2, -1}, {4, 3}};
        printMatrix(matrix1);
        System.out.println("---------------------------------------------------------");
        printMatrix(matrix2);
        System.out.println("---------------------------------------------------------");
        printMatrix(matrixMultiplication(matrix1, matrix2));
    }

    private static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2.length) throw new RuntimeException("Invalid length");
        }
        for (int i = 0; i < matrix2.length; i++) {
            if (matrix2[i].length != matrix1.length) throw new RuntimeException("Invalid length");
        }
        int[][] newMatrix = new int[matrix1.length][];
        for (int i = 0; i < newMatrix.length; i++) {
            newMatrix[i] = new int[matrix2[i].length];
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                int sum = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                newMatrix[i][j] = sum;
            }
        }
        return newMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
