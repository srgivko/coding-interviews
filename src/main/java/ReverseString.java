import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(reverseLine(line));
    }

    private static String reverseLine(String line) {
        int size = line.length();
        char[] remainder = new char[size];
        for (int i = 0; i < size; i++) {
            remainder[size - i - 1] = line.charAt(i);
        }
        return new String(remainder);
    }
}
