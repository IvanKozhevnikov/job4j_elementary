package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxmin10Tomin7Thenmin7() {
        int result = Max.max(-10, -7);
        assertThat(result, is(-7));
    }

    @Test
    public void whenMax7To7Then7() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax330To257Then330() {
        int result = Max.max(330, 257);
        assertThat(result, is(330));
    }
}