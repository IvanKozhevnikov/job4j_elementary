package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when01to04then3() {
        int expected = 3;
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0min1to0min5then3() {
        int expected = 4;
        int x1 = 0;
        int y1 = -1;
        int x2 = 0;
        int y2 = -5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to16then4() {
        int expected = 4;
        int x1 = 1;
        int y1 = 2;
        int x2 = 1;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}