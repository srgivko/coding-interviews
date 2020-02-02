import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintRepeatedCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        printRepeatedCharacters(line);
    }

    private static void printRepeatedCharacters(String line) {
        char[] chars = line.toCharArray();
        Map<Character, Integer> characterIntegerHashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < chars.length; i++) {
            if (characterIntegerHashMap.containsKey(chars[i]))
                characterIntegerHashMap.put(chars[i], characterIntegerHashMap.get(chars[i]) + 1);
            else characterIntegerHashMap.put(chars[i], 1);
        }
        System.out.println(characterIntegerHashMap);
    }
}
