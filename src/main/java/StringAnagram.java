import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        System.out.println(isStringAnagram(line1, line2));
    }

    private static boolean isStringAnagram(String line1, String line2) {
        char[] chars1 = line1.toCharArray();
        char[] chars2 = line2.toCharArray();
        if (chars1.length != chars2.length) return false;
        for (int i = 0; i < chars1.length; i++) {
            int j;
            for (j = 0; j < chars2.length; j++) {
                if (chars2[j] == chars1[i]) {
                    chars2[j] = '\0';
                    break;
                }
            }
            if (j == chars2.length) return false;
        }
        return true;
    }
}
