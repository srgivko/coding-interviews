import java.util.Scanner;

public class PrintPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        printPyramid(size);
    }

    private static void printPyramid(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                if( j != 0 ) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
