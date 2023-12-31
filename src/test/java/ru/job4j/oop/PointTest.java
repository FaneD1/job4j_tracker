package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to02then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2minus1to04then5dot38() {
        double expected = 5.38;
        Point first = new Point(2, -1);
        Point second = new Point(0, 4);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when84to91then3dot16() {
        double expected = 3.16;
        Point first = new Point(8, 4);
        Point second = new Point(9, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus52to02then3minus4() {
        double expected = 10;
        Point first = new Point(-5, 2);
        Point second = new Point(3, -4);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}