package ru.job4j.array;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas10ThenMinus1() {
        int[] data = new int[]{4, 12, 8, 5};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[]{5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int el = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 5;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[]{5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{3, 5, 7, 10, 2, 1, 7, 2};
        int el = 8;
        int start = 0;
        int finish = 7;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}