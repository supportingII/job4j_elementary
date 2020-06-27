package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void when187ManHeight() {
        short in = 187;
        double expect = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expect, out, 0.01);
    }

    @Test
    public void when187WomanHeight() {
        short in = 187;
        double expect = 88.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expect, out, 0.01);
    }
}