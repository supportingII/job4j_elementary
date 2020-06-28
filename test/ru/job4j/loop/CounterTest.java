package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void sumStart0Finish10() {
        int start = 0;
        int finish = 10;
        int expect = 55;
        int out = Counter.sum(start, finish);

        assertThat(expect, is(out));
    }

    @Test
    public void sumByEvenStart0Finish10() {
        int start = 0;
        int finish = 10;
        int expect = 30;
        int out = Counter.sumByEven(start, finish);

        assertThat(expect, is(out));
    }
}