package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }

    @Test
    public void when2() {
        boolean rsl = CheckPrimeNumber.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when0() {
        boolean rsl = CheckPrimeNumber.check(0);
        assertThat(rsl, is(false));
    }

    @Test
    public void when10() {
        boolean rsl = CheckPrimeNumber.check(10);
        assertThat(rsl, is(false));
    }

    @Test
    public void when997() {
        boolean rsl = CheckPrimeNumber.check(997);
        assertThat(rsl, is(true));
    }

    @Test
    public void when11() {
        boolean rsl = CheckPrimeNumber.check(11);
        assertThat(rsl, is(true));
    }

    @Test
    public void when20() {
        boolean rsl = CheckPrimeNumber.check(20);
        assertThat(rsl, is(false));
    }

    @Test
    public void when564() {
        boolean rsl = CheckPrimeNumber.check(564);
        assertThat(rsl, is(false));
    }
}