package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

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
    public void whenMax9To7Then7() {
        int result = Max.max(350, 257);
        assertThat(result, is(350));
    }
}