package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int expect = 120;
        int out = Factorial.calc(5);
        assertThat(expect, is(out));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int expect = 1;
        int out = Factorial.calc(0);
        assertThat(expect, is(out));
    }
}