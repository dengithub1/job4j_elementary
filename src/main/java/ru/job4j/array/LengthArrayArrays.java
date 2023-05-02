package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{4}, {4, 5}, {4, 5, 6}, {4, 5, 6, 7}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива: " + numbers[i].length);
        }
    }
}
