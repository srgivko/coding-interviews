import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int armstrongNumber = scanner.nextInt();
        System.out.println(isArmstrongNumber(armstrongNumber));
    }

    private static boolean isArmstrongNumber(int armstrongNumber) {
        int temp = armstrongNumber;
        int checkNumber = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            checkNumber += Math.pow(remainder, 3);
            temp /= 10;
        }
        return checkNumber == armstrongNumber;
    }
}
