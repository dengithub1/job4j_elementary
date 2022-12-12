package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                boolean temp = data[i];
                if (temp != data[j]) {
                    result = false;
                    break;
            }
            }
            break;
        }
        return result;
    }
}
