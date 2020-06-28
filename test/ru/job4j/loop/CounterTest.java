package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void sumStart0Finish10() {
        int expect = 55;
        int out = Counter.sum(0, 10);

        assertThat(expect, is(out));
    }

    @Test
    public void sumByEvenStart0Finish10() {
        int expect = 30;
        int out = Counter.sumByEven(0, 10);

        assertThat(expect, is(out));
    }
}