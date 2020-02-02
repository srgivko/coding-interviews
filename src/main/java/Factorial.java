import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorial(number));
        System.out.println(factorial2(number));
    }

    private static int factorial2(int number) {
        int fact = 1;
        if( 0 >= number ) return 0;
        for (int i = 2; i <= number; i++) {
            fact*=i;
        }
        return fact;
    }

    private static int factorial(int number) {
        if (0 >= number) return 0;
        if (number == 1) return 1;
        return number * factorial(number - 1);
    }
}
