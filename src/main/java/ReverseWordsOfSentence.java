import java.util.Scanner;

public class ReverseWordsOfSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(reverseWords(line));
    }

    private static String reverseWords(String line) {
        String[] strings = line.split(" ");
        StringBuilder newString = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            newString.append(strings[i] + " ");
        }
        return newString.toString();
    }
}
