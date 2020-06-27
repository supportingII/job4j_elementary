package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        int p = 4, k = 1;
        double expect = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expect, out, 0.01);
    }

    @Test
    public void whenP8K3Then3() {
        int p = 8, k = 3;
        double expect = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expect, out, 0.01);
    }
}