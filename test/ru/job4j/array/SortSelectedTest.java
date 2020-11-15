package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5numbers() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3numbers() {
        int[] input = new int[] {3, -3, 0, 2, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-3, 0, 2, 3, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort7numbers() {
        int[] input = new int[] {3, -3, 0, 2, 55, 834, -1050};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-1050, -3, 0, 2, 3, 55, 834};
        assertThat(result, is(expect));
    }
}