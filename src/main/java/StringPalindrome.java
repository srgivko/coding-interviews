import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(isPalindrom(word));
    }

    private static boolean isPalindrom(String word) {
        char[] chars = word.toCharArray();
        int size = chars.length;
        for (int i = 0; i < size / 2; i++) {
            if(chars[i]!=chars[size-i-1]) return false;
        }
        return true;
    }
}
