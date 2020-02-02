import java.util.Arrays;

public class AddingTwoMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        showMatrix(addingTwoMatrix(matrix1, matrix2));
    }

    private static int[][] addingTwoMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) throw new RuntimeException("invalid length");
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) throw new NullPointerException("invalid length");
        }
        int[][] newMatrix = new int[matrix1.length][];
        for (int i = 0; i < newMatrix.length; i++) {
            newMatrix[i] = new int[matrix1.length];
            for (int j = 0; j < newMatrix.length; j++) {
                newMatrix[i][j] = matrix1[i][j] + matrix1[i][j];
            }
        }
        return newMatrix;
    }

    private static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
