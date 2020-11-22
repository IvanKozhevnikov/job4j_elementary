package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when01to04then3() {
        int expected = 3;
        Point a = new Point(0, 1);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0min1to0min5then3() {
        int expected = 4;
        int x1 = 0;
        int y1 = -1;
        int x2 = 0;
        int y2 = -5;
        Point a = new Point(0, -1);
        Point b = new Point(0, -5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to16then4() {
        int expected = 4;
        int x1 = 1;
        int y1 = 2;
        int x2 = 1;
        int y2 = 6;
        Point a = new Point(1, 2);
        Point b = new Point(1, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}