package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (array[i] + array[j] != target) {
                j++;
                if (j == array.length) {
                    j = 0;
                    i++;
                }
            } else {
                return new int[]{i, j};
            }
        }
        return new int[0];
    }
}
