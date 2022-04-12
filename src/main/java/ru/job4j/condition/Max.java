package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        if (left == right) {
            result = left;
        }
        return result;
    }

    public static void main(String[] args) {
        int maxValue = Max.max(4, 6);
        System.out.println(maxValue);
    }
}