package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B9C0X2Then40() {
        int a = 1; int b = 1; int c = 1; int x = 1;
        int expected = a * x * x + b * x + c;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        a = 0; b = 1; c = 1; x = 1;
        expected = a * x * x + b * x + c;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        a = 1; b = 1; c = 0; x = 1;
        expected = a * x * x + b * x + c;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        a = 1; b = 1; c = 1; x = 0;
        expected = a * x * x + b * x + c;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}