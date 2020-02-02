package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 1, 0, 2, 3, 5, 67, 2, 13, 54, 1};
        sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void sort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int current = ints[i];
            int j = i - 1;
            while (j >= 0) {
                if (current < ints[j]) {
                    ints[j + 1] = ints[j];
                    j--;
                } else {
                    break;
                }
            }
            ints[j + 1] = current;
        }
    }
}
