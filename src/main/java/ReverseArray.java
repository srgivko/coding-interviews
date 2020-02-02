import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        System.out.println(Arrays.toString(reverseArray(ints)));
    }

    private static int[] reverseArray(int[] ints) {
        int[] ints1 = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            ints1[ints.length - 1 - i] = ints[i];
        }
        return ints1;
    }
}
