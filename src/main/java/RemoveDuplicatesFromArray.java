import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        final int size = 10;
        String[] strings = new String[size];
        Integer[] integers = new Integer[size];

        for (int i = 0; i < size; i++) {
            strings[i] = i % 4 + "";
            integers[i] = i % 4;
        }
        integers[9] = 9;
        strings[8] = 5 + "";
        System.out.println(Arrays.toString(removeDuplicates(strings)));
        System.out.println(Arrays.toString(removeDuplicates(integers)));
    }

    private static <T> T[] removeDuplicates(T[] array) {
        T[] cloneArray = array.clone();
        int size = cloneArray.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (cloneArray[i] != null && cloneArray[i].equals(cloneArray[j])) cloneArray[j] = null;
            }
        }
        return cloneArray;
    }
}
