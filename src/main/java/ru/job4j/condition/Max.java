package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(left, right) >= third ? max(left, right) : third;
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(left, right) >= max(third, fourth) ? max(left, right) : max(third, fourth);
    }

    public static void main(String[] args) {
        int maxValue = Max.max(4, 6);
        System.out.println(maxValue);
    }
}
