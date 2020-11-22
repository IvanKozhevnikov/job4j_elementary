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
        Point a = new Point(0, -1);
        Point b = new Point(0, -5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to16then4() {
        int expected = 4;
        Point a = new Point(1, 2);
        Point b = new Point(1, 6);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1116to1112then14() {
        double expected = 14.69;
        Point a = new Point(11, 1, 6);
        Point b = new Point(1, 11, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMin79min1min9toMin1min23min2then81() {
        double expected = 81.34;
        Point a = new Point(-79, -1, -9);
        Point b = new Point(-1, -23, -2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}