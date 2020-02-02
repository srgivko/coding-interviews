package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 1, 0, 2, 3, 5, 67, 2, 13, 54, 1};
        bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void bubbleSort(int[] ints) {
        for (int i = 1; i < ints.length - 1; i++) {
            for (int j = ints.length - 1; j >= i; j--) {
                if (ints[j] < ints[j - 1]) swap(ints, j, j - 1);
            }
        }
    }

    private static void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }
}
