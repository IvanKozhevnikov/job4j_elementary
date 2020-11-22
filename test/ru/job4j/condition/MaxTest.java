package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxMin10ToMin7ThenMin7() {
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

    @Test
    public void whenMax330To257To400To578Then330() {
        int result = Max.max(330, 257, 400, 578);
        assertThat(result, is(578));
    }

    @Test
    public void whenMax330ToMin15To1900Then330() {
        int result = Max.max(330, -15, 1900);
        assertThat(result, is(1900));
    }
}
