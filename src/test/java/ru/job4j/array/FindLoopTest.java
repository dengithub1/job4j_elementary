package ru.job4j.array;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas10ThenMinus1() {
        int[] data = new int[] {4, 12, 8, 5};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assertions.assertThat(result).isEqualTo(expected);
    }

}