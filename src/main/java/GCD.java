import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(gcd(firstNumber, secondNumber));
        System.out.println(gcd2(firstNumber, secondNumber));
    }

    private static int gcd(int x, int y) {
        if (x < y) {
            int temp = y;
            y = x;
            x = temp;
        }
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    private static int gcd2(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd2(y, x % y);
    }
}
