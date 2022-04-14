package ru.job4j.condition;

public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(9, 10));
        System.out.println(sum(5, 215));
    }
}
