import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static final char SPECIAL_CHARACTER = '*';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            System.out.println(firstNonRepeatedCharacter(line));
        }
    }

    private static char firstNonRepeatedCharacter(String line) {
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j;
            char remainder = chars[i];
            boolean isNonRepeated = true;
            chars[i] = SPECIAL_CHARACTER;
            if (remainder == SPECIAL_CHARACTER) continue;
            for (j = i + 1; j < chars.length; j++) {
                if (remainder == chars[j]) {
                    chars[j] = SPECIAL_CHARACTER;
                    isNonRepeated = false;
                }
            }
            if (isNonRepeated) return remainder;
        }
        return SPECIAL_CHARACTER;
    }
}
