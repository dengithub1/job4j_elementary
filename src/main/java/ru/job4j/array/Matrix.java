package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] multipleMatrix = new int[size][size];
        for (int i = 0; i < multipleMatrix.length; i++) {
            for (int j = 0; j < multipleMatrix[i].length; j++) {
                multipleMatrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return multipleMatrix;
    }
}
