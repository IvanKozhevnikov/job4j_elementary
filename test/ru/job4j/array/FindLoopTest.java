package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas8Then4() {
        int[] input = {5, 4, 3, 2, 8};
        int value = 8;
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5Length3Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind4() {
        int[] input = new int[] {5, 2, 10, 2, 200};
        int value = 200;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6Length6ThenMin1() {
        int[] input = new int[] {5, 10, 3, 9, 11, 27};
        int value = 6;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas0Length4ThenMin1() {
        int[] input = new int[] {5, 12, 3, 7};
        int value = 0;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
