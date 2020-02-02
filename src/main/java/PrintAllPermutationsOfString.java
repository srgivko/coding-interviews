import java.util.Scanner;

public class PrintAllPermutationsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        printAllPermutationsOfString(line);
    }

    private static void printAllPermutationsOfString(String line) {
        printAllPermutationsOfString("", line);
    }

    private static void printAllPermutationsOfString(String s, String line) {
        if (line.isEmpty()) {
            System.out.println(s + line);
        } else {
            for (int i = 0; i < line.length(); i++) {
                printAllPermutationsOfString(s + line.charAt(i), line.substring(0, i) + line.substring(i + 1));
            }
        }
    }
}
