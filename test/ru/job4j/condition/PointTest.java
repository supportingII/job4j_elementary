package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenNotZero() {
        int x1, y1, x2, y2;
        x1 = 15; x2 = 12; y1 = 3; y2 = 5;
        double expect = 3.605551275463989;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expect, out, 0.001);
    }

    @Test
    public void whenX1Zero() {
        int x1, y1, x2, y2;
        x1 = 0; x2 = 12; y1 = 3; y2 = 5;
        double expect = 12.165525060596439;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expect, out, 0.001);
    }
}